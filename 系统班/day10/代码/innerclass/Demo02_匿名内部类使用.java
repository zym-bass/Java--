package com.ujiuye.innerclass;

public class Demo02_匿名内部类使用 {
    public static void main(String[] args) {
    	// MyInter接口的实现类对象(匿名内部类对象)
    	new MyInter() {
			@Override
			public void fun() {
				System.out.println("匿名内部类实现fun");
			}

			@Override
			public int getSum(int x, int y) {
				return x + y;
			}
		}.fun();
		
		// 匿名内部类优化 : 利用接口的多态性
		// 父接口引用 指向 接口实现类对象
		// my对象名调用的就是等号右边实现类中重写方法
		MyInter my = new MyInter() {
			@Override
			public void fun() {
				System.out.println("有名内部类实现fun");
			}

			@Override
			public int getSum(int x, int y) {
				return x + y;
			}
		};
		
		my.fun();
		System.out.println(my.getSum(3, 5));
	}
}

interface MyInter {
	public abstract void fun();
	public abstract int getSum(int x, int y);
}

class MyInterImpl implements MyInter{

	@Override
	public void fun() {
		System.out.println(123);
	}

	@Override
	public int getSum(int x, int y) {
		
		return 0;
	}
	
}

