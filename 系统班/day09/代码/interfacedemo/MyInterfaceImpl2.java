package com.ujiuye.interfacedemo;

public class MyInterfaceImpl2 implements MyInterface{

	@Override
	public void eat() {
		System.out.println("�ӿ�ʵ������д����eat");
	}

	@Override
	public boolean equal(double x, double y) {
		return x == y;
	}

}
