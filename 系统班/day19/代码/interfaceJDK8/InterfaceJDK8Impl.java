package com.ujiuye.interfaceJDK8;

public class InterfaceJDK8Impl extends Fu implements MyInter,MyMyInter2{
	@Override
	public void eat() {
		System.out.println("MyInter接口的实现类重写抽象方法eat");
	}
	
	// 实现类中可以重写父接口中的默认方法
	// 1) 类中不能写default 默认修饰的, 不写才表示默认修饰
	// 2) 实现类重写默认方法时, 修饰符需要是public修饰
	@Override
	public void sleep() {
		System.out.println("重写的父接口中的默认方法sleep");
	}

	@Override
	public void fun() {
		// 如果实现类重写冲突方法功能时, 发现现在想调用某一个父接口中默认方法实现过程 : 
		// 语法  父接口名.super.方法名(实际参数);
		MyInter.super.fun();
		MyMyInter2.super.fun();
		System.out.println("父接口中fun冲突, 实现类只能重写, 否则代码会报错");
	}
}

interface MyInter{
	public abstract void eat();
	
	default void fun() {
		System.out.println("父接口MyInter中默认方法fun");
	}
	
	// 在接口中定义出一个使用default修饰的默认方法
	default void sleep() {
		System.out.println("父接口MyInter中默认方法sleep");
	}
}

interface MyMyInter2{
	// MyMyInter2接口的默认方法fun与接口MyInter中默认方法一致
	default void fun() {
		System.out.println("父接口MyInter2中冲突的默认方法fun");
	}
}
