package com.ujiuye.interfacedemo;

public class TestInterface {

	public static void main(String[] args) {
		// Cannot instantiate the type MyInterface
		// 1. 接口不能实例化
		// MyInterface my = new MyInterface();
		
		// 2. 重写了接口中所有抽象方法实现类, 可以正常使用
		MyInterfaceImpl2 my2 = new MyInterfaceImpl2();
		my2.eat();
		System.out.println(my2.equal(3.14, 3.5));
		
		// 3. 接口中只能定义出成员常量
		System.out.println(接口组成.I);// 接口名.直接调用i, 证明i是static修饰
		// The final field 接口组成.i cannot be assigned
		// 接口组成.i = 99;  final修
		
		// 接口组成.J = 999;
	}
}
