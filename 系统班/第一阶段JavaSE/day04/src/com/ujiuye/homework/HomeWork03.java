package com.ujiuye.homework;

public class HomeWork03 {
	public static void main(String[] args) {
		
		int num = 0;
		int j = 0;
		for(int x = 1000; x<10000;x++) {
			//将x赋值给s
			int s=x;
			//求和
			
			
			for(int i =0 ;i<4 ;i++) {
				j = s % 10;
				num += j*j*j*j;
				s/=10;
			}
			
			if(num == x) {
				System.out.println(x);
			}
			num = 0;
		}
	}
}
