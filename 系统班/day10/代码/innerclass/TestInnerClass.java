package com.ujiuye.innerclass;

public class TestInnerClass {

	public static void main(String[] args) {
		// 1. 普通成员内部类测试
		Body b = new Body();
		b.useHeart();
		// 访问成员变量
		System.out.println(b.blood);
		System.out.println("------------");
		
		// 3)普通成员内部类在除了外部类的其他类型中 : 调用方式为
		//  外部类.内部类 内部类变量 = new 外部类().new 内部类对象();
		Body.Heart h1 = new Body().new Heart();
		System.out.println(h1.jump);
		h1.show();
		
		// 2. 私有成员内部类测试
		Body1 b1 = new Body1();
		b1.useGan();
		
		System.out.println("------");
		
		// 3. 静态成员内部类测试
		System.out.println(Body2.Shen.drink);// 2
		// 创建出一个静态成员内部类对象
		Body2.Shen b2 = new Body2.Shen();
		System.out.println(b2.wc);// 5
		b2.show();// 1天,喝了2升水,需要去卫生间5次
	}
}
