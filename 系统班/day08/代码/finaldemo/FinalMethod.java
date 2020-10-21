package com.ujiuye.finaldemo;

public class FinalMethod {
    // 1. 定义出一个普通方法
	public void fun() {
		System.out.println("父类的fun");
	}
	
	// 2. 定义出一个使用final修饰方法
	public final void play() {
		System.out.println("父类中的final最终方法, 可以继承, 不能重写");
	}
}
