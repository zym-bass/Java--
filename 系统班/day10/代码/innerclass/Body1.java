package com.ujiuye.innerclass;

public class Body1 {// 外部类
	// drink表示喝酒的斤数
	private int drink = 5;
	
	private class Gan{// 私有成员内部类, 理解成是一个私有成员变量
		String color = "black";
		
		public void show() {
			System.out.println("每天都要喝" + drink + "斤白酒,少喝点,不然以后肝就要变成" + color);
		}
	}
	
	// 对外提供使用私有成员内部类Gan方法功能
	public void useGan() {
		// 创建出一个私有成员内部类对象
		Gan gan = new Gan();
		System.out.println(gan.color);
		gan.show();
	}
}
