package com.ujiuye.otherclass;

public class MathDemo {

	public static void main(String[] args) {
        // 1. Math类中静态成员常量
		System.out.println(Math.E);
		System.out.println(Math.PI);
		
		// 1)abs(int i) : 重载方法, 获取到参数i的绝对值(绝对值都是正数)
		System.out.println(Math.abs(-3));// 3
		
		// 2)ceil(double d) : 将参数数据向上取整, 返回值类型double
		System.out.println(Math.ceil(3.01));// 4.0
		
		// 3)floor(double d) : 将参数数据向下取整, 返回值类型double
		System.out.println(Math.floor(3.99));// 3.0
		
		// 4)max(double d, double d1) : 获取到两数中的较大值
		// 5)min(double d, double d1) : 获取到两数中的较小值
		System.out.println(Math.max(3.14, 3.14));// 3.14
		System.out.println(Math.min(2.13, -9.0));// -9.0
		
		// 6)random() : 生成[0.0, 1.0)之间的随机小数
		System.out.println(Math.random());
		
		/*7)round(double d) : 根据提供的参数的第一个小数位数, 决定数据是向上取整或者是向下取整
                 (第一位小数数值 >= 5, 向上取整; 否则向下取整), 返回一个long类型结果*/
		System.out.println(Math.round(6.77)); // 7
		System.out.println(Math.round(7.51)); // 8
		System.out.println(Math.round(9.49)); // 9
	}
}
