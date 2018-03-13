package com.shsxt.pojo;

import java.util.List;

public class Goods {

	private int id;

	private String GoodsName;

	private double goodsPrice;

	private String goodsImages;
	
	// 图片集合
	private List<GoodsImages> imagesList;
	

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

	public List<GoodsImages> getImagesList() {
		return imagesList;
	}

	public void setImagesList(List<GoodsImages> imagesList) {
		this.imagesList = imagesList;
	}

	@Override
	public String toString() {
		return "Goods [id=" + id + ", GoodsName=" + GoodsName + ", goodsPrice=" + goodsPrice + ", goodsImages="
				+ goodsImages + ", imagesList=" + imagesList + "]";
	}
}