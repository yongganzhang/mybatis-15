package com.shsxt;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.shsxt.dao.GoodsDao;
import com.shsxt.pojo.Goods;
import com.shsxt.pojo.GoodsImages;

public class App {

	public static void main(String[] args) throws IOException {

		// 加载配置文件
		InputStream is = Resources.getResourceAsStream("mybatis-context.xml");

		// 创建一个SqlSession工厂
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

		// 打开 session会话
		SqlSession session = factory.openSession(true);
		
		
		GoodsDao goodsDao = session.getMapper(GoodsDao.class);

		// 一级缓存
//		 goodsDao.queryGoodsImagesBeanByGoodsId(2);
//		
//		 session.clearCache();
//		 goodsDao.queryGoodsImagesBeanByGoodsId(2);
		
		// 二级缓存
		
		 goodsDao.queryGoodsImagesBeanByGoodsId(2);
		 session.close();
		 
		 session = factory.openSession(true);
		 GoodsDao  goodsDao2 = session.getMapper(GoodsDao.class);
		 goodsDao2.queryGoodsImagesBeanByGoodsId(2);
		 session.close();
		 
	}
}
