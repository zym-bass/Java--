package com.ujiuye.block;

public class Demo01_局部代码块 {
	public static void main(String[] args) {
		
		int j = 88;
		//局部代码块
		{
			int i = 10 ;
			System.out.println(i);
			j = 99 ;
		}
		
		
		
	}
}
