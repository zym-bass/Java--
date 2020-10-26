package com.ujiuye.homework10;

public class Dog extends Animal {

	@Override
	public void eat(String something) {
		System.out.println(getAge() + "岁的," + getColor()+"颜色的狗两条前腿死死的抱住" + something + "在吃");
	}
	
	public void lookHome() {
		System.out.println("狗可以看家");
	}

}
