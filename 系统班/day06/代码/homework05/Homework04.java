package com.ujiuye.homework05;

import java.util.Scanner;
public class Homework04 {
	/*注意 : 
		矩形需要输入长和宽, 面积公式 : 长 * 宽
		三角形需要输入底和高,面积公式 : (底*高)/2
		圆形需要输入半径r, 面积公式 : 3.14 * r * r*/
	public static void main(String[] args) {
         
		  Scanner sc = new Scanner(System.in);
		  // 1. 因为支持无限次图形面积求取, 设计出一个死循环
		  while(true) {
			  System.out.println("计算面积");
			  System.out.println("1.矩形   2.三角形   3.圆形   4.退出");
			  System.out.println("请选择数字对应的功能 (1-4): ");
			  // 2. 先录入一个数据
			  int number = sc.nextInt();
			  // 3. 判断number范围,决定计算图形
			  if(1 == number) {
				  System.out.println("你选择了矩形");
				  System.out.println("请输入矩形的长:");
				  int chang = sc.nextInt();
				  System.out.println("请输入矩形的宽:");
				  int kuan = sc.nextInt();
				  System.out.println("矩形的面积为 : " + chang * kuan);
			  }else if(2 == number) {
				  System.out.println("你选择了三角形");
				  System.out.println("请输入三角形的底:");
				  int di = sc.nextInt();
				  System.out.println("请输入三角形的高:");
				  int gao = sc.nextInt();
				  System.out.println("三角形的面积为 : " + (di * gao)/2.0);
			  }else if(3 == number) {
				  System.out.println("你选择了圆形");
				  System.out.println("请输入圆形的半径:");
				  int r = sc.nextInt();
				  System.out.println("圆形的面积为 : " + 3.14 * r * r);
			  }else if(4 == number) {
				  System.out.println("退出系统,谢谢使用");
				  break;
			  }else {
				  System.out.println("输入数据有误");
			  }
		  }
	}
}
