package com.ujiuye.function;

public class Demo02_方法重载 {

	public static void main(String[] args) {
		System.out.println(getSum(3,5));
		System.out.println(getSum(3,5,6));
		System.out.println(getSum(3.5,5.0));
	}
	
	// 1)要求做两个任意整数求和
	public static int getSum(int x, int y) {
		return x + y;
	}
	
	// 2) 要求做三个整数求和
	public static int getSum(int x, int y ,int z) {
		return x + y + z;
	}
	
	// 3) 要求做2个double浮点类型求和
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
