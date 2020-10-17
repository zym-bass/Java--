package com.ujiuye.variable;

public class Demo02_常量默认类型 {

	public static void main(String[] args) {
		// 5常量int类型数据
		System.out.println(5);
		//The literal 12345678912 of type int is out of 
		//System.out.println(12345678912);
		long l = 12345678912L;
		
		// 3.14常量double类型
		System.out.println(3.14);
		//Type mismatch: cannot convert from double to float
		//float f = 3.14;
		float f = 3.14F;
	}
}
