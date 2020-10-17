package com.ujiuye.cal;

public class Demo01_基本算数运算符 {

	public static void main(String[] args) {
		// +
		System.out.println(+3);// 3
		System.out.println(3 + 2);// 5
		System.out.println("6" + 5);// "65"
		
		// -
		System.out.println(-3);// -3
		System.out.println(-3 - 2);// -5
		
		// *
		System.out.println(3 * 2);// 6
		
		// /
		System.out.println(5 / 3);// 1
		System.out.println(5.0 / 3);// 1.6666666666666667
		
		// %
		// 7 % 3 = 7 / 3 = 2...1  取模结果就是1
		System.out.println(7 % 3);// 1
		// 10 % 5 = 10 / 5 = 2...0  获取结果就是0
		System.out.println(10 % 5);// 0
		// 取模运算结果的符号位与 %前面的被除数符号位一致
		System.out.println(-7 % 3);// -1 
		System.out.println(7 % -3);// 1
		System.out.println(-7 / 3);// -7 / 3 = -2...-1
		System.out.println(7 / -3);// 7 / -3 = -2...1
	}
}
