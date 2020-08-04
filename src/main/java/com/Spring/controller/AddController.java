package com.Spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Spring.entity.UserDetailTable;
import com.Spring.service.UserDetailService;

//@RequestMapping(path = "/SpringJsp")
@Controller
public class AddController {
	
	@Autowired
	private UserDetailService userDetailService;

	@RequestMapping(path= "/add",method = RequestMethod.POST)
	public String add(UserDetailTable userdetail) {
		
		
		System.out.println(userdetail.toString());
		userDetailService.save(userdetail);
		return "display";
	}
	
	@GetMapping(path = "/register")
	public String register() {
		System.out.println("IN Register......");
		return "register";
	}
	
	@RequestMapping(path= "/get",method=RequestMethod.GET)    
    public String greet(){
		UserDetailTable userdetail = new UserDetailTable();
		userdetail.setFirstName("shyam");
		userdetail.setLastName("kotadiya");
		userdetail.setGender("f");
		userdetail.setHobbies("Cricket,vollyball");
		userDetailService.save(userdetail);
        System.out.println("hello world!!! ");
        
        return "display.jsp";
    }
}
