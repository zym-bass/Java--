package com.ujiuye.homework03;

import java.util.Random;
import java.util.Scanner;
public class Homework3 {
	/*3. 模拟双色球案例 : 
	    双色球分为红色球和蓝色球, 系统随机生成一个1-32之间的红色球和一个1-16之间的蓝色球,
	客户通过键盘录入购买的红色球和蓝色球号码,验证客户是否中奖
	    1) 如果只买中蓝球, 3等奖,10万元
	    2) 如果只买中红球, 2等奖, 30万元
	    3) 如果红球和蓝球都买中, 1等奖, 50万元*/
	public static void main(String[] args) {
		  Random ran = new Random();
          // 1. 生成1-32之间随机红色球
		  int xtRed = ran.nextInt(32)+1;
		  System.out.println("红色球为:" + xtRed);
		  // 2. 生成1-16之间随机蓝色球
		  int xtBlue = ran.nextInt(16)+1;
		  System.out.println("蓝色球为:" + xtBlue);
		  
		  Scanner sc = new Scanner(System.in);
		  // 3. 客户购买红色球
		  System.out.println("请客户购买一个1-32之间的红色球:");
		  int khRed = sc.nextInt();
		  // 4. 客户购买蓝色球
		  System.out.println("请客户购买一个1-16之间的蓝色球:");
		  int khBlue = sc.nextInt();
		  
		  // 5. 验证客户是否中奖
		  if(khRed == xtRed && khBlue == xtBlue) {
			  System.out.println("1等奖, 50万元");
		  }else if(khRed == xtRed) {
			  System.out.println("2等奖, 30万元");
		  }else if(khBlue == xtBlue) {
			  System.out.println("3等奖,10万元");
		  }else {
			  System.out.println("抱歉,没有中奖");
		  }
	}
}
