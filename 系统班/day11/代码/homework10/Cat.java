package com.ujiuye.homework10;

public class Cat extends Animal {

	@Override
	public void eat(String something) {
		System.out.println(getAge() + "岁的," + getColor()+"颜色的猫眯着眼睛侧着头吃" + something);
	}
	
	public void catchMouse() {
		System.out.println("猫可以抓老鼠");
	}
}
