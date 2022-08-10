package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.serviceInterface.RedisInterface;

@RestController
@RequestMapping("/redis")
public class RedisController {

	@Autowired
	private RedisTemplate<String, String> redisTemplate;
	
	@Autowired
	private RedisInterface redisService;

	@GetMapping("/test")
	public String test() {

		return "success";
	}

	@GetMapping("/add")
	public String addRedis() {
//		redisTemplate.opsForValue().set("liongogoRedisTest", "I am Lion GoGo");
		
		redisService.addRedis("測試");
		return "加入成功";
	}

	@GetMapping("/getRedis")
	public Object getRedis() {
		return redisTemplate.opsForValue().get("message");
	}

	@GetMapping("/delKey")
	public String delKey() {
//		boolean isSuccess = redisTemplate.delete("liongogoRedisTest");
		boolean isSuccess = redisTemplate.delete("liongogoRedisTest");
    
		return isSuccess ? "刪除成功" : "刪除失敗";
	}

	@GetMapping("/queryKeyTime")
	public Long queryKeyTime() {
		return redisTemplate.getExpire("liongogoRedisTest");
	}
}
