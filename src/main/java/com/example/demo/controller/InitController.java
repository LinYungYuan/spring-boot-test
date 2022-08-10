package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/init")
public class InitController {

	@GetMapping("/test")
	public String test() {

		String str = "123";
		str += 10;
		System.out.print(str);
		int[] a = new int[1];
		a[0]++;
		System.out.println(a[0]);

		return "測試.......";
	}

}
