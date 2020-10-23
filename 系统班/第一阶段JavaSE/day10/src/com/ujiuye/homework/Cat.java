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
		System.out.println(getColour()+"颜色的"+getAge()+"岁的猫正在吃"+something );
	}
	
	public void cathMouse() {
		System.out.println("抓老鼠");
	}
}
