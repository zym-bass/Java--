package com.ujiuye.interfacedemo;

public class MyInterfaceImpl2 implements MyInterface{

	@Override
	public void eat() {
		System.out.println("接口实现类重写方法eat");
	}

	@Override
	public boolean equal(double x, double y) {
		return x == y;
	}

}
