package com.ujiuye.cal;
import java.util.Random;
public class Demo05 {

	public static void main(String[] args) {
		// 需求 : 生成1-100之间的任意一个随机数
		Random ran = new Random();
		int number = ran.nextInt(100)+1;// (0-99) + 1 ---> 1-100
		System.out.println(number);
	}
}