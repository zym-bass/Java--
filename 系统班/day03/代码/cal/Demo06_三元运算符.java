package com.ujiuye.cal;

public class Demo06_三元运算符 {

	public static void main(String[] args) {
		// 需求1 : 定义出一个任意正整数, 判断这个数是奇数还是偶数
		int i = 11;
		// 表达式1 ? 表达式2 : 表达式3;
		String s = i % 2 == 0 ? i + "是偶数" : i + "是奇数";
		System.out.println(s);
		
		// 需求2 : 定义出两个浮点类型数据, 获取到两数中的较大值
		double d1 = 5.77;
		double d2 = 5.77;
		double max = d1 >= d2 ? d1 : d2;
		System.out.println("两数中的较大值为: "+max);
	}
}
