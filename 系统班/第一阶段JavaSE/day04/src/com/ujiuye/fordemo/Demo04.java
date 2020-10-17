package com.ujiuye.fordemo;

public class Demo04 {
	

	public static void main(String[] args) {
		// 需求2 : 打印出1-100中所有可以被7整除数字
		/*
		* 分析 :
		* 1) 获取到1-100中的每一个整数, 才能知道这个数能不能被7整除(设计1-100循环)
		* 2) 在循环中, 获取到每一个数, 使用逻辑验证 % 7 == 0 ,那么输出
		*/
	
		int i = 1;
		while(i <= 100) {
			if(i % 7 == 0) {
				System.out.println(i);
			}
				// 千万不要忘记做初始化语句i的自增动作
			i++;
		}
		
		System.out.println("--------------");
		
		for(int w = 1; w <= 100; w++) {
			if(w % 7 == 0) {
			System.out.println(w);
			}
		}
	}
}
