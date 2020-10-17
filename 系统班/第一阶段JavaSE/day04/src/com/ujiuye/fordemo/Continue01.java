package com.ujiuye.fordemo;

public class Continue01 {
	public static void main(String[] args) {
		//打印0~100所有奇数
		for(int i = 0; i<= 100 ;i++) {
			if(i % 2==0) {
				continue;
			}
		System.out.println(i);
		}
		
		
	}
	

}
