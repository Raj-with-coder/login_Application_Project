package com.user_0.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user_0.model.UserDetail;
import com.user_0.ripository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepo;
	
	@Override
	public UserDetail creatUser(UserDetail user) {
		
		return userRepo.save(user);
	}
	

}
