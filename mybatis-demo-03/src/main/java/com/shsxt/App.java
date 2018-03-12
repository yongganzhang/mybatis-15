package com.shsxt;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.shsxt.dao.UserDao;
import com.shsxt.pojo.User;

public class App {

	public static void main(String[] args) throws IOException {

		// 加载配置文件
		InputStream is = Resources.getResourceAsStream("mybatis-context.xml");

		// 创建一个SqlSession工厂
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

		// 打开 session会话
		SqlSession session = factory.openSession();
		

		// 动态代理生成接口的实现子类
		UserDao userDao = session.getMapper(UserDao.class);

		User user = userDao.queryUserByUid(1);

		System.out.println(user);

		User byName = userDao.queryUserByName("yonggan");
		System.out.println(byName);

	}

}
