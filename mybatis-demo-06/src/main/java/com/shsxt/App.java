package com.shsxt;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.shsxt.dao.GoodsDao;
import com.shsxt.pojo.Goods;

public class App {

	public static void main(String[] args) throws IOException {

		// 加载配置文件
		InputStream is = Resources.getResourceAsStream("mybatis-context.xml");

		// 创建一个SqlSession工厂
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

		// 打开 session会话
		SqlSession session = factory.openSession(true);

		// 动态代理生成接口的实现子类
//		UserDao userDao = session.getMapper(UserDao.class);
		//
		// int r = userDao.delUserById(41);
		// System.out.println(r);

		// 使用map传递参数
//		User user = userDao.queryUserById(1);
//		
//		System.out.println(user);
		
		
		
		GoodsDao goodsDao = session.getMapper(GoodsDao.class);
//		Goods queryGoodsById = mapper.queryGoodsById(2);
//		System.out.println(queryGoodsById);
		
		Goods goods = goodsDao.queryGoodsAndImagesByGoodsId(7);
		System.out.println(goods);
		GoodsDao mapper = session.getMapper(GoodsDao.class);
		Goods queryGoodsById = mapper.queryGoodsById(2);
		System.out.println(queryGoodsById);
		
	}
}
