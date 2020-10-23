package com.ujiuye.homework;

public abstract class Animal {
	//属性 年龄 颜色
	//年龄
	private int age ;
	//颜色
	private String colour ;
	
	
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Animal(int age, String colour) {
		super();
		this.age = age;
		this.colour = colour;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	 abstract void eat(String something);
}
