package com.ujiuye.innerclass;

public class Demo01_普通局部内部类 {

	public static void main(String[] args) {
		breath();
	}
	
	// 定义出一个功能
	public static void breath() {
		// 局部变量无法单独获取到
		int day = 2;
		class Fei{// 局部内部类, 理解成一个局部变量
			int smoke = 50;
			String color = "黑色";
			public void show() {
				System.out.println(day+"天,每天都抽" + smoke + "多根烟,老了以后肺就会变成" + color);
			}
		}
		// 定义一个局部内部类之后, 马上创建出一个局部内部类对象使用
		Fei f = new Fei();
		System.out.println(f.color);
		System.out.println(f.smoke);
		f.show();
	}

}
