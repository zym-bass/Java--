package com.ujiuye.interfacedemo;

public interface 接口组成 {
	// 1. 接口中成员全部默认使用 public static final修饰
	int I = 10;
	public static int J = 29;
	public static final int W = 88;
	
	// 2. 接口中定义抽象方法
	public abstract void eat();
	// 默认修饰符 : public abstract
	public void fun();
	
	// 3. 接口中构造方法
	//Interfaces cannot have constructors
	// 接口不能有构造方法
	/*public 接口组成() {
		
	}*/
}
