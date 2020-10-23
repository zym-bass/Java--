package com.ujiuye.block;

public class Demo02_构造代码块 {
	private String name;
	private int age;
    // 构造代码块
	{
		name = "张三";
		age = 20;
		System.out.println("我是构造代码块");
		System.out.println("我是构造方法----lalalalal");
	}
	
	public Demo02_构造代码块() {
		// System.out.println("我是构造方法----lalalalal");
	}
	
	public Demo02_构造代码块(String name) {
		this.name = name;
		// System.out.println("我是构造方法----lalalalal");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
        // 1. 创建出一个Demo02_构造代码块对象
		Demo02_构造代码块 demo = new Demo02_构造代码块();
		System.out.println(demo.getName());// 张三
		System.out.println(demo.getAge());// 20
		
		Demo02_构造代码块 demo2 = new Demo02_构造代码块("小强");
		System.out.println(demo2.getName());
	}
}
