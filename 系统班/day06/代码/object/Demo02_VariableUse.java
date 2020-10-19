package com.ujiuye.object;

public class Demo02_VariableUse {
    // 成员变量 : 跟着对象存储在堆内存中
	int i = 10;
	
	public void useI() {
		// 局部变量 : 跟着useI方法存储在栈内存中
		int i = 20;
		// 1. i值结果是局部变量20, 表现出变量就近访问原则
		System.out.println(i);// 20
		// 2. 问题 : 如果就需要在useI方法中调用成员变量i
		// 于是 : 思考,今天讲类中的成员变量和方法调用
		System.out.println(new Demo02_VariableUse().i);// 10
		// 3. 另外一种调用成员变量i方式 : this关键字
		System.out.println(this.i);// 10
		System.out.println("this---" + this);
	}
	
	public static void main(String[] args) {
		Demo02_VariableUse demo2 = new Demo02_VariableUse();
		System.out.println("demo2-----"+demo2);
		demo2.useI();
		System.out.println("-------------");
		
		Demo02_VariableUse demo3 = new Demo02_VariableUse();
		System.out.println("demo3----"+demo3);
		demo3.useI();
	}
}
