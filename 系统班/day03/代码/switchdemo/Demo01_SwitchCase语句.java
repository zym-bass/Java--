package com.ujiuye.switchdemo;

public class Demo01_SwitchCase语句 {

	public static void main(String[] args) {
		// 需求 : 定义出一个整数, 用于进行星期匹配, 数据范围1-7,
		// 对应匹配星期一到星期天, 如果不是1-7范围, 那么报出数据错误提示信息
		
		// weekday表示对应星期数值
		int weekday = 12;
		switch(weekday) {
			case 1:
				   System.out.println("星期一");
				   break;
			case 2:
				   System.out.println("星期二");
				   break;
			case 3:
				   System.out.println("星期三");
				   break;
			case 4:
				   System.out.println("星期四");
				   break;
			case 5:
				   System.out.println("星期五");
				   break;
			case 6:
				   System.out.println("星期六");
				   break;
			case 7:
				   System.out.println("星期日");
				   break;
			default :
				  System.out.println("数据输入有误,需要1-7之间数据");
		}
	}
}
