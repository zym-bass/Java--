package com.ujiuye.fordemo;

public class Demo07_Continue {

	public static void main(String[] args) {
		// continue需求 : 打印出1-100中所有偶数数据
		for(int i = 1; i <= 100; i++) {
			if(i % 2 != 0) {
				// 奇数数据不需要打印, 本次循环可以结束
				continue;
			}
			System.out.println(i);
		}
	}
}
