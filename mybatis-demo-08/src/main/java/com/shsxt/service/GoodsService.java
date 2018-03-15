package com.shsxt.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shsxt.dao.GoodsDao;
import com.shsxt.pojo.Goods;

public class GoodsService {

	private static GoodsDao goodsDao;

	static {
		InputStream is = null;
		try {
			is = Resources.getResourceAsStream("mybatis-context.xml");
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 创建一个SqlSession工厂
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

		// 打开 session会话
		SqlSession session = factory.openSession(true);

		goodsDao = session.getMapper(GoodsDao.class);
	}
	
	
	/**
	 * 
	 * @param goodsName
	 * @return
	 */
	public List<Goods> queryGoodsListLikeGoodsName (String goodsName, int pageNum, int pageSize) {
		
		// 设置分页参数
		PageHelper.startPage(1, 2);
		// 查询 数据 
		List<Goods> list = goodsDao.queryGoodsLikeGoodsName("三只松鼠");
		// 分页对象
		PageInfo<Goods> page = new PageInfo<Goods>(list);
		// 获取到分页数据
		List<Goods> list2 = page.getList();
		
		return list2;
			
	}

}
