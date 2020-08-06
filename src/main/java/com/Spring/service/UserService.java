package com.Spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.entity.UserTable;
import com.Spring.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	public void save(UserTable user) {
		userRepo.save(user);
	}
	
	public UserTable getUserByUserName(String user) {
		return userRepo.getUserByUserName(user);
	}
	
}
