package com.ujiuye.homework11;

import java.util.Scanner;

public class Homework2 {
	/*2. 模拟用户登录
	   正确的用户名为admin,密码为adm123
	   键盘录入用户名和密码,一共有三次机会,如果录入错误,提示剩下几次机会,最后一次提示"登录机会已用完"
	   登录成功,提示登录成功*/
	public static void main(String[] args) {
         // 1. 定义出一个正确用户名
		 String rightName = "admin";
		 // 2. 定义出一个正确的密码
		 String rightPassword = "adm123";
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("一共有三次机会");
		 for(int i = 1; i <= 3; i++) {
			 System.out.println("请输入用户名:");
			 String inName = sc.nextLine();
			 System.out.println("请输入密码:");
			 String inPassword = sc.nextLine();
			 
			 // 3. 验证输入的数据与正确数据是否匹配
			 // 使用equals方法比较字符串内容时, 尽量将字符串常量作为方法调用对象, 防止发生空指针异常
			 if(rightName.equals(inName) && rightPassword.equals(inPassword)) {
				 System.out.println("登录成功");
				 break;
			 }else {
				 // 4. 提示客户还剩几次机会
				 if(i == 3) {
					 System.out.println("登录机会已用完");
				 }else {
					 System.out.println("剩余" + (3-i) + "次机会");
				 }
			 }
		 }
	}
}
