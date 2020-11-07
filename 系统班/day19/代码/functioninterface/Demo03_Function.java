package com.ujiuye.functioninterface;

import java.util.function.Function;

public class Demo03_Function {

	public static void main(String[] args) {
		//客户1 : y值为x的2倍
		Function<Integer,Integer> fun1 = x->x*2;
		System.out.println(testFunction(6,fun1));// 12
		
		//客户2 : y值为x + 1
		Function<Integer,Integer> fun2 = x->x+1;
		System.out.println(testFunction(-9,fun2));// -8
		
		//客户3 : y值为x-1
		Function<Integer,Integer> fun3 = x->x-1;
		System.out.println(testFunction(88,fun3));

	}
	/*需求 : 定义出一个方法功能, 根据int类型x的值, 计算出另外一个int类型y的值, 
	y获取方式根据客户的要求决定
	客户1 : y值为x的2倍
	客户2 : y值为x + 1
	客户3 : y值为x-1
	...
	
	*
	*  分析:
	*    1) 第一个参数 : 需要提供int类型x int x
	*    2) 第二个参数 : 需要提供 计算y值方式(规律), 通过x得到y, 可以将Function接口作为方法参数传递,
	*    实际传递 int apply(int x)
	*/
	
	public static int testFunction(int x, Function<Integer,Integer> fun) {
		return fun.apply(x);
	}
}
