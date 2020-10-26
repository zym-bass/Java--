package com.ujiuye.homework10;

public class Person {
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
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person() {
		super();
	}
	
	public void keepPet(Animal a, String something) {
		System.out.println("年龄为" + age +"的" + name + "养了一只" + a.getAge() + "岁的" + a.getColor() + "宠物");
	    a.eat(something);
	}
}
