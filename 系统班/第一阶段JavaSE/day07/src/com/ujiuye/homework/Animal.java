package com.ujiuye.homework;

public class Animal {
	//���ԣ�����������
	private String name  ;
	private int age ;
	
	public Animal() {}
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void eat() {
		System.out.println(age+"���"+name+"���ڳԷ�");
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
	
	
}
