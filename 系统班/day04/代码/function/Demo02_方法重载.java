package com.ujiuye.function;

public class Demo02_�������� {

	public static void main(String[] args) {
		System.out.println(getSum(3,5));
		System.out.println(getSum(3,5,6));
		System.out.println(getSum(3.5,5.0));
	}
	
	// 1)Ҫ�������������������
	public static int getSum(int x, int y) {
		return x + y;
	}
	
	// 2) Ҫ���������������
	public static int getSum(int x, int y ,int z) {
		return x + y + z;
	}
	
	// 3) Ҫ����2��double�����������
	public static double getSum(double x, double y) {
		return x + y;
	}
	
	public static double get(int x, double y) {
		return x + y;
	}
	
	public static double get(double x, int y) {
		return x + y;
	}

}
