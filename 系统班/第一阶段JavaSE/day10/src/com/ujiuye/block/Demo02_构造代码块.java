package com.ujiuye.block;

public class Demo02_构造代码块 {
	//构造代码块在构造方法前，先执行。
	private int age ;
	//构造代码块
	{
		age =242;
		System.out.println("构造代码块");
	}
	public Demo02_构造代码块() {
		System.out.println("构造方法");
	}
}
