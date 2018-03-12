package com.shsxt;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class App {
	
	public static void main(String[] args) throws IOException {
		// 加载配置文件
		InputStream is = Resources.getResourceAsStream("mybatis-context.xml");
	
		// 创建一个SqlSession工厂
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
	
		// 打开 session会话
		SqlSession session = factory.openSession();
		
		Object obj = session.selectOne("com.shsxt.mappper.UserMapper.queryUserById", 1);
		
		System.out.println(obj);
	}

}
