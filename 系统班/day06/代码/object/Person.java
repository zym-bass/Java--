package com.ujiuye.object;

public class Person {
	// 1. 成员变量(全局变量)
	// 姓名
	String name;
	// 年龄
	int age;
	// 性别
	String sex;
	
	// 2. 定义出方法功能
	public void eat() {
		System.out.println(name + "正在吃饭");
	}
	
	public void sleep() {
		System.out.println(name + "目前已经睡觉" + age + "年");
	}
	
	public void work() {
		System.out.println(name + "是" + sex + ", 工作年龄为 : " + age);
	}
}
