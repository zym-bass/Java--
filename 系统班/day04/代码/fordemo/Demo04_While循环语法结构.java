package com.ujiuye.fordemo;

public class Demo04_While循环语法结构 {

	public static void main(String[] args) {
       // 需求1 : 打印1-5所有整数
		for(int i = 1; i <= 5; i++) {
			// 打印数据
			System.out.println("for---"+i);
		}
		
		int j = 1;
		while(j <= 5) {
			System.out.println("while---"+j);
			// 千万不要忘记做初始化语句j的自增动作
			j++;
		}
		System.out.println(j);// 6
	}

}
