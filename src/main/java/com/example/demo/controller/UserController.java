package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

//	@Autowired
//	private UserRepository userRepository;
//
//	@PostMapping("/getAllUser")
//	public List<User> findAll() {
//		return userRepository.findAll();
//	}
//
//	@PostMapping("getUser")
//	public String findById() {
//		return userRepository.findById(1).getName();
//	}
}
