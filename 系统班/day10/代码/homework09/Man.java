package com.ujiuye.homework09;

public class Man {
	// 姓名
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void dealBusiness() {
		System.out.println(name + "在谈生意");
	}
}
