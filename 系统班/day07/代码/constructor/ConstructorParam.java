package com.ujiuye.constructor;

public class ConstructorParam {
	private String name;
	private int age;
	
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
    // 以下三个构造方法重载
	// 定义出有参数构造方法
	public ConstructorParam(String name, int age) {
		// 构造方法的调用,必须写在构造中有效行第一行
		//Constructor call must be the first statement in a constructor
		this(name);
		//this.name = name;
		this.age = age;
	}
	
	public ConstructorParam(String name) {
		this.name = name;
		System.out.println("我是一个参数的构造方法, 我被调用了");
	}
	
	// 定义出一个空参数构造
	public ConstructorParam() {
		name = "大美丽";
		age = 18;
	}
	
	public static void main(String[] args) {
		// 调用有参数构造, 传递实际参数
		ConstructorParam cp = new ConstructorParam("张三", 20);
		System.out.println(cp.getAge());// 20
		System.out.println(cp.getName());// 张三
		
		ConstructorParam cp1 = new ConstructorParam("李四", 19);
		System.out.println(cp1.getName());// 李四
		System.out.println(cp1.getAge());// 19
		
		// 调用空参数构造
		ConstructorParam cp2 = new ConstructorParam();
		System.out.println(cp2.getName());// 大美丽
		System.out.println(cp2.getAge());// 18
	}
}
