package com.ujiuye.extendsDemo;

public class TestAnimalExtends {

	public static void main(String[] args) {
         // 1. ������һ��è�����
		Cat c = new Cat();
		c.eat(); // eat���������ڴӸ���Animal�м̳�����
		c.catchMouse();// catchMouse����������Cat���ͱ���
		
		// 2. ������һ���������
		Dog d = new Dog();
		d.eat();// eat���������ڴӸ���Animal�м̳�����
		d.lookHome();// lookHome����������Dog���ͱ���
	}
}
