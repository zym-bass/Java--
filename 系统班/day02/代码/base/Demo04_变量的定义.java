package com.ujiuye.base;

public class Demo04_变量的定义 {

	public static void main(String[] args) {
		// 数据类型 变量名 = 值;
		int i = 10;
		System.out.println(i + 1);// 11
		// 变量赋值 : 给变量i设置一个新的数值, 达到数值变量过程
		i = 20; // 从第10行开始, 变量i的值已经变成20, 原来的10的值被20覆盖掉
		System.out.println(i);// 20
	}
}
