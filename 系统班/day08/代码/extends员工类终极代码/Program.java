package com.ujiuye.extendslx;

public class Program extends Employee {
    // Employee父类中的4个私有成员变量无法继承使用
	// Program可以继承4个私有成员变量对应间接访问方式, set和get方法
	// 可以继承work方法
	@Override
	public void work() {
		// System.out.println("每个人都需要工作");
		super.work();
		System.out.println(super.getName() + "--" + super.getAge() + "程序员工作就是开发");
	}
	
	public Program() {
		// super(); 默认存在
	}
	
	public Program(String name, int age, String id, double salary) {
		super(name,age,id,salary);
	}
}
