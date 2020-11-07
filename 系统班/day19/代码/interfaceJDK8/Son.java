package com.ujiuye.interfaceJDK8;

public class Son extends Father {
    // 继承到了Father中的静态方法  getSum
	// Son子类中的getSum静态方法不是从重写父类, 而是子类自己定义的静态方法
	// 静态属于类
	public static int getSum(int x, int y) {
		return (x + y) * 2;
	}
	
	public static void main(String[] args) {
		System.out.println(Son.getSum(3, 5));// 8
	}
}
