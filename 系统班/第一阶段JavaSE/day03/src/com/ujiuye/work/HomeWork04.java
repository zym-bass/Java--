package com.ujiuye.work;
import java.util.Scanner;
public class HomeWork04 {
	private static Scanner s ;
	public static Scanner getS() {
		return s;
	}
	public static void setS(Scanner s) {
		HomeWork04.s = s;
	}
	public static void main(String[] args) {
		 s = new Scanner(System.in);
		
		//客户输入月份
		int i = s.nextInt();
		
		
		switch(i) {
		case 12:
		case 1:
		case 2:
			System.out.println("当前季节为春季");
			break;
		case 3:
		case 4:	
		case 5:
			System.out.println("当前季节为夏季。");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("当前季节为秋季。");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("当前季节为冬季。");
			break;
		default:
			System.out.println("输入数据错误");
		}
	}
}
