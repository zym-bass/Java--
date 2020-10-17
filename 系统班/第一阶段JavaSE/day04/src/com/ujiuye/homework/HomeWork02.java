package com.ujiuye.homework;
import java.util.Scanner;
import java.util.Random;
public class HomeWork02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random c = new Random();
		
		int number = c.nextInt(100)+1;
		while(true) {
			System.out.print("请输入：");
			int number01 = s.nextInt();
			if(number01 == number ) {
				System.out.println("恭喜您，答对了");
				break;
			}else if(number01 < number) {
				System.out.println("sorry，您猜小了");
			}else if(number01 > number) {
				System.out.println("sorry,您猜大了");
			}
		}
		
	}
}
