package com.ujiuye.homework07;

public class Animal {
	String name;
	String color;
	public Animal(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	public void eat() {
		String name = "猫";
		System.out.println(name+"在吃...");// 2. 猫在吃...
		System.out.println(this.name + "在吃饭");// 3. 小马在吃饭
	}
	
	public void sleep() {
		System.out.println(name + "在睡觉");// 1. 小狗在睡觉
	}
	
	public static void main(String[] args) {
		Animal a1 = new Animal("小狗", "白色");
		Animal a2 = new Animal("小马", "棕色");
		a1.sleep();
		a2.eat();
	}
}
