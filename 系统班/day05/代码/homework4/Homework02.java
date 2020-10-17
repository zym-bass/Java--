package com.ujiuye.homework4;

import java.util.Random;
import java.util.Scanner;
public class Homework02 {
	/*2. 我们在日常生活中，经常与朋友们玩猜数字的游戏，非常的有趣。现在我们通过java把这个猜数字游戏编写出来。
	   猜数字案例是要完成什么样的功能呢？顾名思义，这个游戏就是你出个数字、我来猜。
	   游戏操作如下：
	       后台预先生成一个1-100之间的随机数，用户键盘录入猜数字
	       如果猜对了，打印“恭喜您，答对了”
	       如果猜错了
		猜大了：打印“sorry，您猜大了!”
		猜小了：打印“sorry，您猜小了!”
	       直到数字猜到为止*/
	public static void main(String[] args) {
         Random ran = new Random();
         // 1. 生成1-100之间的随机整数
         int number = ran.nextInt(100)+1;
         System.out.println(number);
         
         Scanner sc = new Scanner(System.in);
         // 2. 因为客户猜多少次可以猜对未知, 设计出一个while(true)
         System.out.println("请客户输入一个1-100之间的整数:");
         while(true) {
        	 int inNum = sc.nextInt();
        	 if(inNum == number) {
        		 System.out.println("猜对了");
        		 break;
        	 }else if(inNum > number) {
        		 System.out.println("猜大了");
        	 }else {
        		 System.out.println("猜小了");
        	 }
         }
	}
}
