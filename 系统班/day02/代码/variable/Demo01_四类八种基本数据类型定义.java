package com.ujiuye.variable;

public class Demo01_四类八种基本数据类型定义 {

	public static void main(String[] args) {
		// 整数类型
		byte b = 15;
		System.out.println(b);
		short s = 15000;
		System.out.println(s);
		int i = 170000;
		System.out.println(i);
		long l = 123456789;
		System.out.println(l);
		
		// 浮点类型
		// float类型的变量定义时, 数据后面需要添加F, 作为类型标识
		float f = 3.14F;
		System.out.println(f);
		double d = 2.456789;
		System.out.println(d);
		
		// 字符类型
		char ch = 'W';
		System.out.println(ch);
		
		// 布尔类型
		boolean boo = true;
		boolean boo1 = false;
		System.out.println(boo);
		System.out.println(boo1);
	}
}
