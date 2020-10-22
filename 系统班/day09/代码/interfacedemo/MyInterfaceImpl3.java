package com.ujiuye.interfacedemo;

// 实现类没有将接口中的所有抽象方法全部重写, 这个实现类就是一个抽象类, 抽象类不能new对象
public abstract class MyInterfaceImpl3 implements MyInterface{
	@Override
	public void eat() {
		System.out.println("接口实现类重写方法eat");
	}
}
