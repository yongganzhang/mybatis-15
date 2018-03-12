package com.shsxt.dao;

import com.shsxt.pojo.User;

public interface UserDao {
	
	public User queryUserByUid (int  uid) ;
	
	public User queryUserByName (String name);

}
