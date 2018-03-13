package com.shsxt;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

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
		//
		// int r = userDao.delUserById(41);
		// System.out.println(r);

		// 使用map传递参数
		 Map<String , String> params = new HashMap<String , String>();
		 params.put("userName", "sfsfsafa ' or '1'=  '1");
		
		 int r = userDao.delUserByUserName(params);
		 System.out.println(r);

//		int[] ids = new int[3];
//
//		ids[0] = 43;
//		ids[1] = 44;
//		ids[2] = 45;
//		// 批量删除
//		int c = userDao.BathDelUserById(ids);
//		System.out.println(c);
	}

}
