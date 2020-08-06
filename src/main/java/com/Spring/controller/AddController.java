package com.Spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Spring.entity.UserDetailTable;
import com.Spring.entity.UserTable;
import com.Spring.service.UserDetailService;
import com.Spring.service.UserService;

//@RequestMapping(path = "/SpringJsp")
@Controller
public class AddController {
	
	@Autowired
	private UserDetailService userDetailService;
	
	@Autowired
	private UserService userService;

	@RequestMapping(path= "/add",method = RequestMethod.POST)
	public String add(UserDetailTable userdetail) {
		UserTable userTab = userService.getUserByUserName(userdetail.getUsername());
		if(userTab ==null) {
		UserTable user = new UserTable();
		user.setUsername(userdetail.getUsername());
		user.setPassword(userdetail.getPassword());
		userService.save(user);
		userDetailService.save(userdetail);
		return "index";
		}else {
			return "userAlreadySaved";
		}
	}
	
	@RequestMapping(path= "/checkLogin",method = RequestMethod.POST)
	public String checkLogin(UserTable user) {
		
		
		UserTable userTab = userService.getUserByUserName(user.getUsername());
		if(userTab !=null) {
			
		if(user.getPassword().equals(userTab.getPassword())) {
			return "display";
		}else {
			return "notAuthorize";
		}
		}else {
			return "notAuthorize";
		}
	}
	
	@GetMapping(path = "/register")
	public String register() {
		System.out.println("IN Register......");
		return "index";
	}
	
	@RequestMapping(path= "/login",method=RequestMethod.GET)    
    public String greet(){
	
        System.out.println("in login!!! ");
        
        return "login";
    }
}
