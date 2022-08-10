package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.demo.serviceInterface.AsyncInterface;
import com.example.demo.serviceInterface.RedisInterface;

@Service
public class RedisService implements RedisInterface {

	private static final Logger logger = LoggerFactory.getLogger(AsyncInterface.class);
	
//	@Autowired
//	private RedisTemplate<String, Object> redisTemplate;
	
	@Cacheable("message")
	public String addRedis(String message) {
		
		logger.debug("=========新增" + message + "========");
		

		return message;
	}

	@Override
	public String getRedisValue(String key) {
		// TODO Auto-generated method stub
		return null;
	}
}
