package com.shsxt;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
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

		// User user = new User();
		// user.setUserName("zhanghanyun");
		// user.setUserBalance(123.33);// 阿刁

		// int res = userDao.insertUserHasNoKey(user);
		// System.out.println(res);

		// userDao.insertUserHasKey(user);
		// System.out.println(user.getId());

		
		// 批量添加
//		List<User> list = new ArrayList<User>();
//		for (int i = 0; i < 5; i++) {
//			User user = new User();
//			user.setUserName("test" + i);
//			user.setUserBalance(123.33);
//			list.add(user);
//		}
//		userDao.bathInsertUser(list);
		
		
		//修改操作
//		User user = new User();
//		user.setId(39);
//		user.setUserBalance(0.314);
//		
//		int res = userDao.updateUserBalanceById(user);
//		System.out.println(res);
//		
		
		// 批量修改
		List<Integer> list = new ArrayList<Integer>();
		list.add(41);
		list.add(42);
		list.add(43);
		
		userDao.bathUpdateUserBalanceById(list);
	}
}
