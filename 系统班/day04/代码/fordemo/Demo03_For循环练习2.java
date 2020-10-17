package com.ujiuye.fordemo;

public class Demo03_For循环练习2 {

	public static void main(String[] args) {
		// 需求3 : 打印1-100累加和
		/*
		 *  分析 :
		 *    1) 需要获取到1-100中的每一个数字(设计出一个1-100数字循环)
		 *    2) 将获取到的每一个整数在循环中进行累加
		 * 
		 * */
		// sum变量用于表示1-100所有数据的累加和结果
		// 在for循环小括号中定义的变量 i , 只能在for循环的大括号中使用, 出了for循环大括号
		// 变量超出了作用范围
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			// 循环的i值就是1-100的每一个整数
			sum = sum + i;// sum += i;
		}
		System.out.println(sum);
		// System.out.println(i);
	}
}
