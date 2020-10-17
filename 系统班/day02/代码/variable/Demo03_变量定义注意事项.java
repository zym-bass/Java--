package com.ujiuye.variable;

public class Demo03_变量定义注意事项 {

	public static void main(String[] args) {
		/*1.变量具有作用范围:
			   自变量定义位置起,包含这个变量,离这个变量最近的一对大括号就是这个变量使用范围*/
		int i = 10;
		
		{
		   int y = 20;	
		   System.out.println(i + y);// 30
		}
		// y cannot be resolved to a variable(y无法解析成一个变量)
		// System.out.println(y); 错误原因是y使用超出变量作用范围
		System.out.println(i);
		
		// 2.相同作用域中的变量名不能重复
		int w = 10;
		// int w = 19;
		// Duplicate local variable w : 重复本地变量w
		// double w = 3.14;
		System.out.println(w);
		
		// 3.变量声明和变量赋值可以分开
		//  解释 : int i; // 变量声明   i = 20; // 变量赋值
		int t;
		// 4. 定义在方法中变量, 如果没有赋值不能使用
		//The local variable t may not have been initialized(初始化,表示赋值)
		// 本地变量t, 可能没有赋值
		// System.out.println(t);
		t = 99;
		System.out.println(t);// 99
		
		// 5.相同类型变量可以连续定义(了解)
		int z = 80, v = 20;
	}
}
