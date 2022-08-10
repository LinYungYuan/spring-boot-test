package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.serviceInterface.AsyncInterface;

@RestController
@RequestMapping("/async")
public class AsyncController {

	@Autowired
	private AsyncInterface asyncService;

	@GetMapping("/test")
	public String test() {

		for (int i = 0; i < 10; i++)
			asyncService.doSomething(String.valueOf(i));
		
		return "success";
	}

}
