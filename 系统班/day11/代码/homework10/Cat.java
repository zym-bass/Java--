package com.ujiuye.homework10;

public class Cat extends Animal {

	@Override
	public void eat(String something) {
		System.out.println(getAge() + "���," + getColor()+"��ɫ��è�����۾�����ͷ��" + something);
	}
	
	public void catchMouse() {
		System.out.println("è����ץ����");
	}
}
