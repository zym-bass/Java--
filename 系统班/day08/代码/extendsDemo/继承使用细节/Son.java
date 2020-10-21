package com.ujiuye.extendsDemo;

public class Son extends Father {
	int my = 88;
	// 1. 子类中定义出了与父类同名成员变量
	int i = 0;
	// 2. 子类中定义出于父类不同方法功能
	public void useI() {
		int i = 199;
		// 2. i值访问使用变量就近访问原则
		System.out.println(i);// 199
		System.out.println(this.i);// 0
		// 3. 调用父类中的同名成员变量,可以使用super关键字; i = 10
		System.out.println(new Father().i);// 10
		System.out.println(super.i);// 10
	}
	
	// 3.子类重写从父类Father中继承来方法功能eat
	@Override
	public void eat() {
		// 4. 使用super.调用父类中方法功能
		super.eat();
		System.out.println("子类Son重写父类方法eat, 子类不吃胡萝卜");
	}
	
	// 5. 子类构造方法
	public Son() {
		//super();// 默认存在. 调用父类空参数构造
		// 子类构造方法第一行调用父类构造, 保证父类中数据优先于子类进入内存中
		super(9);
	}
	
	public Son(String s) {
		this();
		System.out.println(s);
	}
}
