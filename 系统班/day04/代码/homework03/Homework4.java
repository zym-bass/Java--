package com.ujiuye.homework03;

import java.util.Scanner;
public class Homework4 {
	/*4. 键盘录入一个月份，输出这个月份的季节
	3、4、5月是春季，6、7、8月是夏季，9、10、11秋季，12、1、2冬季
	其他数字，没有任何季节，提示"输入数据错误"*/
	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("请输入1-12之间数据, 用于进行月份匹配:");
         // yue表示月份
         int yue = sc.nextInt();
         switch(yue) {
            case 3:
            case 4:
            case 5:
            	System.out.println("春季");
            	break;
            case 6:
            case 7:
            case 8:
            	System.out.println("夏季");
            	break;
            case 9:
            case 10:
            case 11:
            	System.out.println("秋季");
            	break;
            case 12:
            case 1:
            case 2:
            	System.out.println("冬季");
            	break;
            default : 
            	System.out.println("输入月份数据有误");
         }
	}
}
