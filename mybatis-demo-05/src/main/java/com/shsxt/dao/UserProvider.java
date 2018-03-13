package com.shsxt.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.jdbc.SQL;

public class UserProvider {
	
	 public String deleteUser(@Param("id")int id){
	        return new SQL(){{
	        	DELETE_FROM("yg_customer").WHERE("id  =  #{id}");
	        }}.toString();
	    }

}
