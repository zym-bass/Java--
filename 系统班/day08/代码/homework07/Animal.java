package com.ujiuye.homework07;

public class Animal {
	String name;
	String color;
	public Animal(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	public void eat() {
		String name = "è";
		System.out.println(name+"�ڳ�...");// 2. è�ڳ�...
		System.out.println(this.name + "�ڳԷ�");// 3. С���ڳԷ�
	}
	
	public void sleep() {
		System.out.println(name + "��˯��");// 1. С����˯��
	}
	
	public static void main(String[] args) {
		Animal a1 = new Animal("С��", "��ɫ");
		Animal a2 = new Animal("С��", "��ɫ");
		a1.sleep();
		a2.eat();
	}
}
