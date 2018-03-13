package com.shsxt.pojo;

public class Goods {

	private int id;

	private String GoodsName;

	private double goodsPrice;

	private String goodsImages;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGoodsName() {
		return GoodsName;
	}

	public void setGoodsName(String goodsName) {
		GoodsName = goodsName;
	}

	public double getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(double goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public String getGoodsImages() {
		return goodsImages;
	}

	public void setGoodsImages(String goodsImages) {
		this.goodsImages = goodsImages;
	}

	@Override
	public String toString() {
		return "Goods [id=" + id + ", GoodsName=" + GoodsName + ", goodsPrice=" + goodsPrice + ", goodsImages="
				+ goodsImages + "]";
	}
	
	

}
