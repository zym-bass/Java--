package com.ujiuye.extendsDemo;

public class Father {
    // 1. 成员变量
	int i = 10;
	static int w = 99;
	private int fa = 888;
	
	// 2. 方法功能
	public void eat() {
		System.out.println("父类中的eat功能");
	}
	
	public void sleep() {
		System.out.println("父类中的sleep功能");
	}
	
	// 3. 构造方法
	public Father() {
		System.out.println("父类构造执行了");
	}
	
	public Father(int i) {
		this.i = i;
		System.out.println("父类有参构造执行");
	}
}
