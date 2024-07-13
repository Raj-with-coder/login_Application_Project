package com.user_0.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.w3c.dom.ls.LSOutput;

import com.user_0.model.UserDetail;
import com.user_0.service.UserService;

@Controller

public class HomeController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	
	@PostMapping("/createUser")
	public String createuser(@ModelAttribute UserDetail user) {
		
		//System.out.println(user);
		userService.creatUser(user);
		
		return "register";
				
	}
}
