package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.example.demo.serviceInterface.AsyncInterface;

@Service
public class AsyncService implements AsyncInterface{

	private static final Logger logger = LoggerFactory.getLogger(AsyncInterface.class);

	// 指定使用beanName為doSomethingExecutor的線程池
	@Async("doSomethingExecutor")
	public String doSomething(String message) {
		logger.info("do something, message={}", message);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			logger.error("do something error: ", e);
		}
		return message;
	}
}
