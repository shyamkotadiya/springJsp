package com.Spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.entity.UserDetailTable;
import com.Spring.repository.UserDetailRepository;

@Service
public class UserDetailService {

	@Autowired
	private UserDetailRepository userDetailRepo;
	
	public void save(UserDetailTable userDetil) {
		userDetailRepo.save(userDetil);
	}
}
