package com.shsxt.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.shsxt.pojo.User;

public interface UserDao {
	
	@Select("select id ,user_name 'userName' , user_balance 'userBalance' from yg_customer where id  =  #{id} ")
	public User queryUserByid (int id);
	
	@Delete ("delete from yg_customer where id  =  #{id}")
	public int delUserById  (int id) ;
	
	@DeleteProvider (method = "deleteUser" ,type = UserProvider.class)
	public int delUserByIdV2  (@Param("id") int id) ;
	
}
