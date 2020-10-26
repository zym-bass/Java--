package com.ujiuye.homework10;

class BaseTmp {
	 BaseTmp(){
		System.out.println("BaseTmp");// 3.BaseTmp  // 5. BaseTmp
	}
}

class Base{
	BaseTmp tmp = new BaseTmp();
	static {
		System.out.println("Base静态");// 1. Base静态
	}
	
	Base(){       
		System.out.println("Base");// 4.Base 
	}
}

class BaseChild extends Base{
	BaseTmp tmp = new BaseTmp();// 5.
	static {
		System.out.println("BaseChild静态");// 2.BaseChild静态
	}
	BaseChild(){
		super();
		System.out.println("BaseChild");// 6. BaseChild
	}
}

class Demo{
	public static void main(String[] args) {
		// 1. 因为使用BaseChild, 因此BaseChild对应的父类Base.class字节码文件先进入到方法区, 加载所有静态成员
		// 2.BaseChild.class字节码文件进入到方法区中, 加载所有静态成员
		// 3.因为创建一个子类BaseChild对象, 父类优先于子类进入到堆内存中, JVM将父类中所有非静态成员变量
		// 加载进入到子类所在堆内存中
		// 4.调用父类构造方法, 给父类成员变量进行赋值
		// 5. 子类成员变量需要加载进入到堆内存中
		// 6. 调用子类构造方法给子类成员变量进行赋值
		 new BaseChild();
	}
}

