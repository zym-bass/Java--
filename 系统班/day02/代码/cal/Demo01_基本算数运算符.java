package com.ujiuye.cal;

public class Demo01_������������� {

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
		// 7 % 3 = 7 / 3 = 2...1  ȡģ�������1
		System.out.println(7 % 3);// 1
		// 10 % 5 = 10 / 5 = 2...0  ��ȡ�������0
		System.out.println(10 % 5);// 0
		// ȡģ�������ķ���λ�� %ǰ��ı���������λһ��
		System.out.println(-7 % 3);// -1 
		System.out.println(7 % -3);// 1
		System.out.println(-7 / 3);// -7 / 3 = -2...-1
		System.out.println(7 / -3);// 7 / -3 = -2...1
	}
}
