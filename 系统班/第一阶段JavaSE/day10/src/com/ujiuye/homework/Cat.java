package com.ujiuye.homework;

public class Cat extends Animal{
	public Cat() {
		super();
	}

	public Cat(int age, String colour) {
		super(age, colour);
		// TODO Auto-generated constructor stub
	}
	
	public void eat (String something ) {
		System.out.println(getColour()+"��ɫ��"+getAge()+"���è���ڳ�"+something );
	}
	
	public void cathMouse() {
		System.out.println("ץ����");
	}
}
