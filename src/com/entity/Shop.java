package com.entity;
/** 

* @version 创建时间：2020年3月26日 上午10:21:04 

* 类说明 

*/
public class Shop {
	private int id;
	private String goodno;//商品编码
	private String goodname;//商品名称
	private int stocknum;//存库
	private double price;//单价
	private String url;//图片地址
	private String remark;//介绍
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGoodno() {
		return goodno;
	}
	public void setGoodno(String goodno) {
		this.goodno = goodno;
	}
	public String getGoodname() {
		return goodname;
	}
	public void setGoodname(String goodname) {
		this.goodname = goodname;
	}
	public int getStocknum() {
		return stocknum;
	}
	public void setStocknum(int stocknum) {
		this.stocknum = stocknum;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "Shop [id=" + id + ", goodno=" + goodno + ", goodname=" + goodname + ", stocknum=" + stocknum
				+ ", price=" + price + ", url=" + url + ", remark=" + remark + "]";
	}

}
