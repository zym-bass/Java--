package com.ujiuye.homework03;

import java.util.Scanner;
public class Homework2 {
	/*2、键盘录入整数x的值，计算出对应的y值并输出。
	
	* x>=3		y = 2 * x + 1;
	* -1<x  并且 x<3	y = 2 * x;
	* x<=-1		y = 2 * x - 1;*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数:");
		int x = sc.nextInt();
		// 根据x的取值范围计算出对应的y值
		int y = 0;
		if(x >= 3) {
			y = 2 * x + 1;
		}else if(x > -1) {
			y = 2 * x;
		}else if(x <= -1){
			y = 2 * x - 1;
		}
		//The local variable y may not have been initialized
		System.out.println(y);
	}
}
