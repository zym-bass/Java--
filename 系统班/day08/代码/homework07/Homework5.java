package com.ujiuye.homework07;

// ˽�г�Ա����, set��get����, �ղ��вι���, ��Ʒ�ʽ��Ϊ JavaBean������ƹ淶
public class Homework5 {
	// ����:����name,����age ; ��Ϊ:�Է�eat
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
		// 1. ������һ������
		Homework5 cat = new Homework5("��è",3);
		cat.eat();
		// 2. �ٴ�����һ������
		Homework5 dog = new Homework5();
		dog.setName("�ߵ�");
		dog.setAge(2);
		dog.eat();
	}
}
