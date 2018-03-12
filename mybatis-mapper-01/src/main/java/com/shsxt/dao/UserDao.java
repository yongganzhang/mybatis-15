package com.shsxt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shsxt.pojo.User;

public interface UserDao {
	
	public User queryUserByUid (int  uid) ;
	
	
	public List<User> queryUserLikeUserName (@Param ("userName")String  name) ;
	
	
	public int insertUserHasNoKey (User user);
	
}
