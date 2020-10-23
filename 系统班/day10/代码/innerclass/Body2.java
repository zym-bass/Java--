package com.ujiuye.innerclass;

public class Body2 {// 外部类
	int day = 1;
	
	static class Shen{
		static int drink = 2;
		int wc = 5;
		
		public void show() {
			// 1. 静态成员内部类中, 不能直接使用外部类中非静态成员, 可以先创建出一个外部类对象
			// 使用对象名.调用
			Body2 b2 = new Body2();
			System.out.println(b2.day + "天,喝了" + drink + "升水,需要去卫生间" + wc+"次");
		}
	}

}
