package com.ujiuye.homework;
import java.util.Scanner;
import java.util.Random;
public class HomeWork02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random c = new Random();
		
		int number = c.nextInt(100)+1;
		while(true) {
			System.out.print("�����룺");
			int number01 = s.nextInt();
			if(number01 == number ) {
				System.out.println("��ϲ���������");
				break;
			}else if(number01 < number) {
				System.out.println("sorry������С��");
			}else if(number01 > number) {
				System.out.println("sorry,���´���");
			}
		}
		
	}
}
