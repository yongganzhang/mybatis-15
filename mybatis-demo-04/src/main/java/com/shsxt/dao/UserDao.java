package com.shsxt.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.shsxt.pojo.User;

public interface UserDao {
	
	public int delUserById (@Param("id") int uid);
	
	public int delUserByUserName (Map<String, String> map);

	/**
	 * 批量删除 用户
	 * @param ids
	 * @return
	 */
	public int BathDelUserById (int[] ids);
	
	
	//////////////////////////
	///////////动态SQL//////////////
	///////////////////////
	
	public List<User> queryUserlikeUserName (@Param("userName") String userName);
	
	
	public List<User> queryUserByUserNameOrUserBal (User user);
	
}
