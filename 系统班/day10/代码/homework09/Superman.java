package com.ujiuye.homework09;

public class Superman extends Man {
	@Override
	public void dealBusiness() {
		System.out.println(getName() + "在谈几亿大生意");
	}
	
	public void fly() {
		System.out.println(super.getName() + "正在飞,等着救人");
	}
}
