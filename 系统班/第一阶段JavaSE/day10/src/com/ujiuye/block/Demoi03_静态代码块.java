package com.ujiuye.block;

public class Demoi03_静态代码块 {
	static final String schoolName;
	int  i ; 
	
	static {
		schoolName = "第一成员";
		System.out.println("静态代码块执行了");
	}
	
	//构造代码块
	{
		i = 10 ;
		System.out.println("我是构造代码块");
	}

	public Demoi03_静态代码块() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
