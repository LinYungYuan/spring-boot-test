package com.example.demo.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.serviceInterface.AsyncInterface;
import com.example.demo.serviceInterface.MybatisInterface;

@Service
public class MybatisService implements MybatisInterface {

	private static final Logger logger = LoggerFactory.getLogger(AsyncInterface.class);
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public List<User> queryUser() {
		logger.debug("===========mybatis 測試===========");
		UserMapper userMapper = sqlSessionTemplate.getMapper(UserMapper.class);
		List<User> userList= userMapper.queryAlluser();
		return userList;
	}

}
