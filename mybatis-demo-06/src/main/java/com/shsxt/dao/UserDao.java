package com.shsxt.dao;

import org.apache.ibatis.annotations.Param;

import com.shsxt.pojo.User;

public interface UserDao {
	
	public User queryUserById (@Param ("id") Integer id) ;
	
	
	
	
}
