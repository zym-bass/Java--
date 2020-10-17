package com.ujiuye.fordemo;

public class Demo01 {
	public static void main(String[] args) {
	// 需求 : 打印1-5所有数字
	/*System.out.println(1);
	System.out.println(2);
	System.out.println(3);
	System.out.println(4);
	System.out.println(5);*/
	
		/*for( 初始化语句; 循环判断条件; 初始化语句变化 ){
		需要反复多次执行的代码逻辑;
		}
		
		*2.解释:
		1)for : 关键字, 表示循环的概念
		2)初始化语句 : 定义出一个变量, 变量用于表示循环的起点或者用于记录循环的次数
		3)循环判断条件 : boolean类型表达式, 可以决定循环何时结束
		4)初始化语句变化 : 从循环的起点每次循环结束之后,向着循环的终点(循环结束)方向进行数据变化(自增最常见初始化变量语句变化方式)
		*/
		
		for(int i = 1; i <= 3; i++) {
			// 打印数据
			System.out.println(i);
		}
	}
}
