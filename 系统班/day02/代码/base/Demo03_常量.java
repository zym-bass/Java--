package com.ujiuye.base;

public class Demo03_常量 {

	public static void main(String[] args) {
        // 整数类型
		System.out.println(5);
		// 浮点类型
		System.out.println(5.2);
		// 字符类型
		System.out.println('a');
		System.out.println('W');
		System.out.println('9');
		System.out.println(';');
		System.out.println('家');
		// System.out.println('-1'); 这不是一个字符, 两个字符
		
		// 布尔类型
		System.out.println(true);
		System.out.println(false);
		
		// 字符串常量
		System.out.println("123abc");
		String s = null;
		System.out.println(s);
		System.out.println("12  ??00--456YU你几号?");
		System.out.println("2020年-10月-13日");
		
		System.out.println("--------------");
		
		// 字符串常量的加法运算
		System.out.println("6"+ 5);// "65"
		// 1) "6" + 5 = "65"  2)"65" + 4 = "654" 
		System.out.println("6"+ 5 + 4); // "654"
		// 1) 5 + 4 = 9  2) "6" + 9 = "69"
		System.out.println("6" + (5 + 4));// "69"
		// 1) 5 + 4 = 9  2) 9 + "6" = "96"  3) "96" + 1 = "961"
		System.out.println(5 + 4 + "6" + 1);// "961"
	}
}
