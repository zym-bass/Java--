package com.ujiuye.homework10;

public abstract class Animal {
	// ÄêÁä£¬ÑÕÉ«
	private int age;
	private String color;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Animal(int age, String color) {
		super();
		this.age = age;
		this.color = color;
	}
	public Animal() {
		super();
	}
	
	public abstract void eat(String something);
}
