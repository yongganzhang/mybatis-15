package com.shsxt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shsxt.pojo.Goods;
import com.shsxt.pojo.GoodsImages;

public interface GoodsDao {
	
	
	public Goods queryGoodsById (int id) ;
	
	public  Goods queryGoodsAndImagesByGoodsId (int  id) ;
	
	public List<GoodsImages> queryGoodsImagesBeanByGoodsId (@Param("id") int goodsId);

}
