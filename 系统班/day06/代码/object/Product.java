package com.ujiuye.object;

public class Product {
	// 属性 : 产品编号 
	private String id;
	// 产品名称
	private String name;
	// 产品单价
	private double price;
	
	// 可以使用快捷键 : alt + shift + s 自动生成私有成员变量对应的set和get方法
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
