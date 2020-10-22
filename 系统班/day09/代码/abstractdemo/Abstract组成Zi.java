package com.ujiuye.abstractdemo;

public class Abstract组成Zi extends Abstract组成 {

	@Override
	public int getSum(int x, int y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		Abstract组成Zi az = new Abstract组成Zi();
		System.out.println(az.getSum(3, 5));
		System.out.println(az.i);
		az.fun();
		
		// 测试 : 抽象类也可以使用多态
		Abstract组成 a = new Abstract组成Zi();
		System.out.println(a.getSum(5, 6));// 11
	}

}
