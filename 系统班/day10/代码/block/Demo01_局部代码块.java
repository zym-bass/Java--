package com.ujiuye.block;

public class Demo01_局部代码块 {

	public static void main(String[] args) {
		int j = 88;
        // 局部代码块
		{
		   // 1. 限定定义在局部代码块中的变量使用范围
		   int i = 10;	// 变量定义
		   System.out.println(i);
		   j = 99;// 变量赋值, 局部代码块对于j值, 不会发生影响, 正常使用
		}
		// i cannot be resolved to a variable
		// System.out.println(i);
		System.out.println(j);// 99
		
	}
}
