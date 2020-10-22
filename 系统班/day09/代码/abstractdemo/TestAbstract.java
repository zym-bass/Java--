package com.ujiuye.abstractdemo;

public class TestAbstract {

	public static void main(String[] args) {
		//Cannot instantiate the type AbstractClass
		// 抽象类不能实例化对象(new 对象)
		// AbstractClass ac = new AbstractClass();
		
		AbstractClassZi1 ac1 = new AbstractClassZi1();
		ac1.eat();
	}

}
