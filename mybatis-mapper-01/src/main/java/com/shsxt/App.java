package com.shsxt;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

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
		SqlSession session = factory.openSession(true);

		// 动态代理生成接口的实现子类
		UserDao userDao = session.getMapper(UserDao.class);

		// List<User> list = userDao.queryUserLikeUserName("y");
		// for (User user : list) {
		// System.out.println(user);
		// }

		User user = new User();
		user.setUserName("zhangshaohan");
		user.setUserBalance(123.33);// 阿刁

		int res = userDao.insertUserHasNoKey(user);
		System.out.println(res);

	}
}
