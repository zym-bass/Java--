package com.ujiuye.variable;

public class Demo05_强制类型转换 {

	public static void main(String[] args) {
		// 1. 强制类型转换数据不丢失
		//公式 :小数据类型 = (小数据类型)需要转换大类型数据;
		int i = 88;
		byte b = (byte)i;
		System.out.println(b);// 88
		
		// 2. 强制类型转换数据丢失
		int w = 1000;
		byte b1 = (byte)w;
		System.out.println(b1);// -24
		
		
		double d = 3.001;
		int t = (int)d;
		System.out.println(t);// 3
	}
}
