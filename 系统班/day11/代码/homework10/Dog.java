package com.ujiuye.homework10;

public class Dog extends Animal {

	@Override
	public void eat(String something) {
		System.out.println(getAge() + "���," + getColor()+"��ɫ�Ĺ�����ǰ�������ı�ס" + something + "�ڳ�");
	}
	
	public void lookHome() {
		System.out.println("�����Կ���");
	}

}
