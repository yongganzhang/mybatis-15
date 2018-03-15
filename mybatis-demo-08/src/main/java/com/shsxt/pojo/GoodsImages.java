package com.shsxt.pojo;

/**
 * 商品图片类
 * 
 * @author Mr.YongGan.Zhang
 * @versin 1.0.0
 * @since JDK1.8
 */
public class GoodsImages {

	private int id;
	
	private int goodsId;

	//图片 地址
	private String goodsImage;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsImage() {
		return goodsImage;
	}

	public void setGoodsImage(String goodsImage) {
		this.goodsImage = goodsImage;
	}

	@Override
	public String toString() {
		return "GoodsImages [id=" + id + ", goodsId=" + goodsId + ", goodsImage=" + goodsImage + "]";
	}
	
}
