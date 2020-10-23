package com.ujiuye.homework;

public class Person {
	private String name;
	private int age ;
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
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	} 
	
	public void keepPet (Animal a , String something ) {
		System.out.println("年龄为"+getAge()+"岁的"+getName()+"养着一只"+a.getColour()+"颜色的"+a.getAge()+"岁的宠物" );
		a.eat(something);
	}
}
