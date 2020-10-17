package com.ujiuye.switchdemo;

public class Demo02_SwitchCase穿透性 {

	public static void main(String[] args) {
		/*需求 : 定义出一个整数, 用于进行工作日与休息日匹配, 数据范围1-5,
		输出工作日; 数据范围6-7输出休息日; 其余数据报出”数据有误”提示信息*/
		
		// weekday表示星期数据
		int weekday = 13;
		/*switch(weekday) {
			case 1 : 
				System.out.println("工作日");
				break;
			case 2 : 
				System.out.println("工作日");
				break;
			case 3 : 
				System.out.println("工作日");
				break;
			case 4 : 
				System.out.println("工作日");
				break;
			case 5 : 
				System.out.println("工作日");
				break;
			case 6 : 
				System.out.println("休息日");
				break;
			case 7 : 
				System.out.println("休息日");
				break;
			default :
				System.out.println("数据输入有误,需要1-7之间数据");
		}*/
		
		switch(weekday) {
			case 1 : 
			case 2 : 
			case 3 : 
			case 4 : 
			case 5 : 
				System.out.println("工作日");
				break;
			case 6 : 
			case 7 : 
				System.out.println("休息日");
				break;
			default :
				System.out.println("数据输入有误,需要1-7之间数据");
	    }	
	}

}
