package com.ujiuye.fordemo;

import java.util.Scanner;
public class Break01 {
	private static Scanner sc;
	public static void main(String[] args) {
		/*break需求 : 模拟用户登录界面, 正确用户名为 : 123 , 正确的密码为: 456, 
		需要客户通过键盘录入登录的用户名和密码, 如果输入数据正确, 
		显示登录成功; 如果输入数据有误, 可以支持无限次输入用户名和密码,
		直到输入正确的数据为止*/
		
		// 1.定义出正确用户名
		int name = 123;
		// 2.定义出正确密码
		int password = 456;
		 sc = new Scanner(System.in);
		
		while(true) {
			// inName表示通过键盘录入的用户名
			System.out.println("请输入用户名:");
			int inName = sc.nextInt();
			// inName表示通过键盘录入的密码
			System.out.println("请输入密码");
			int inPassword = sc.nextInt();
			
			if(inName == name && inPassword == password) {
				System.out.println("登录成功!");
				// break结束循环
				break;
			}else {
				System.out.println("输入数据有误,请重新登录");
			}
		}
		
		
		
		
	}

}