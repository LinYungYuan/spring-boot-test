package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class MybatisTestController {

	
//	@PostMapping("/getAllUser")
//	public List<User> findAll() {
//		
//		List<User> userList = new ArrayList<>();
////		userList = userRepository.findAll();
//		return userList;
//	}

	@PostMapping("getUser")
	public String findById() {
		String name = "";
//		name = userRepository.findById(1).getName();
		return name;
	}
}
