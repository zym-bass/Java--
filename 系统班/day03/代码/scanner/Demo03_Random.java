package com.ujiuye.scanner;

import java.util.Random;
public class Demo03_Random {

	public static void main(String[] args) {
		// ���� : ����1-100֮�������һ�������
		Random ran = new Random();
		int number = ran.nextInt(100)+1;// (0-99) + 1 ---> 1-100
		System.out.println(number);
	}
}
