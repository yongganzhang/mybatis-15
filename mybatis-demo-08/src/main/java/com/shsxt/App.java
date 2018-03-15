package com.shsxt;

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
import com.shsxt.service.GoodsService;

public class App {

	public static void main(String[] args) throws IOException {

		GoodsService service = new GoodsService();
		
		List<Goods> list = service.queryGoodsListLikeGoodsName("三只松鼠", 1, 2);
		
		for (Goods goods : list) {
			System.out.println(goods);
		}
		
	}
}
