package com.ujiuye.homework;

public class Dog extends Animal {
	
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(int age , String colour ) {
		super(age , colour);
	}
	
	public void eat (String something ) {
		System.out.println(getColour()+"��ɫ��"+getAge()+"��Ĺ����ڳ�"+something );
	}
	
	public void lookHome() {
		System.out.println("����");
	}
	
}
