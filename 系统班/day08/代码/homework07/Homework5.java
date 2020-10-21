package com.ujiuye.homework07;

// 私有成员变量, set和get方法, 空参有参构造, 设计方式称为 JavaBean代码设计规范
public class Homework5 {
	// 属性:姓名name,年龄age ; 行为:吃饭eat
	private String name;
	private int age;
	
	public void eat() {
		System.out.println(name + "---" + age);
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
	
	public Homework5(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Homework5() {}
	
	public static void main(String[] args) {
		// 1. 创建出一个对象
		Homework5 cat = new Homework5("花猫",3);
		cat.eat();
		// 2. 再创建出一个对象
		Homework5 dog = new Homework5();
		dog.setName("斑点");
		dog.setAge(2);
		dog.eat();
	}
}
