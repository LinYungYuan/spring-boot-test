package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.User;

/**
 * Mapper 又等於是Dao 建立資料訪問對象
 * 
 * @author admin
 *
 */
@Mapper
public interface UserMapper {

	public List<User> queryAlluser();

	public User queryuserbyid(int id);
}
