package com.ujiuye.abstractdemo;

//The type AbstractClassZi1 must implement the inherited abstract method AbstractClass.eat()
public class AbstractClassZi1 extends AbstractClass {
	/*
	    抽象方法重写 : 
	     去掉abstract关键字, 方法添加大括号, 其他与普通方法重写一致
	 */
	@Override
	public void eat() {
		System.out.println("子类重写了抽象方法");
	}
}
