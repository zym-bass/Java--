/*键盘录入整数x的值，计算出对应的y值并输出。
		
		* x>=3		y = 2 * x + 1;
		* -1<x  并且 x<3	y = 2 * x;
		* x<=-1		y = 2 * x - 1;*/

package com.ujiuye.work;
//键盘输入导包
import java.util.Scanner;

public class HomeWork02 {
	
	//创建键盘扫描仪 a
	private static Scanner a;//私有静态变量
	
	public static Scanner getA() {
		return a;
	}

	public static void setA(Scanner a) {
		HomeWork02.a = a;
	}
	//入口
	public static void main(String[] args) {
		
		//a为键盘输入名
		 a = new Scanner(System.in);
		//输入整数
		System.out.print("请输入一个整数：");
		int x = a.nextInt();
		int y = 0 ;
		if(x>=3) {
			y = 2*x + 1 ;
		}else if( x > -1 && x < 3) {
			y = 2*x ;
		}else if(x < -1) {
			y = 2*x - 1 ;
		}
		System.out.println(y);
	}

}
