package com.shsxt;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.shsxt.dao.UserDao;
import com.shsxt.pojo.User;

public class AppTest {

	public static void main(String[] args) throws IOException {

		// 加载配置文件
		InputStream is = Resources.getResourceAsStream("mybatis-context.xml");

		// 创建一个SqlSession工厂
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

		// 打开 session会话
		SqlSession session = factory.openSession(true);

		// 动态代理生成接口的实现子类
		UserDao userDao = session.getMapper(UserDao.class);

//		List<User> list = userDao.queryUserlikeUserName(null);
//
//		for (User user : list) {
//			System.out.println(user);
//		}
		
		
//		User user = new User();
//		user.setUserName("y");
//		user.setUserBalance(30);
//		List<User> list = userDao.queryUserByUserNameOrUserBal(user);
//		for (User u : list) {
//			System.out.println(u);
//		}
		
//		List<User> list = userDao.queryUserById(1);
//		
//		for (User u : list) {
//			System.out.println(u);
//		}
		
		List<User> users = userDao.queryUserByUser("yonggan");
		for (User user : users) {
			System.out.println(user);
		}
	}

}
