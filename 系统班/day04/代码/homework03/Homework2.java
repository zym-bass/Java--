package com.ujiuye.homework03;

import java.util.Scanner;
public class Homework2 {
	/*2������¼������x��ֵ���������Ӧ��yֵ�������
	
	* x>=3		y = 2 * x + 1;
	* -1<x  ���� x<3	y = 2 * x;
	* x<=-1		y = 2 * x - 1;*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������:");
		int x = sc.nextInt();
		// ����x��ȡֵ��Χ�������Ӧ��yֵ
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
