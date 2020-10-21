package com.ujiuye.extendsDemo;

public class TestFuAndZi {

	public static void main(String[] args) {
       Zi z = new Zi();
       System.out.println(z.i);// 10
       // The field Fu.j is not visible
       // 1. 子类中不能继承使用父类中的私有成员变量
       // System.out.println(z.j);
       
       z.fun();// 我是父类中fun方法
       // The method sleep() from the type Fu is not visible
       // 2. 子类中不能继承使用父类中的私有方法
       // z.sleep();
	}
}
