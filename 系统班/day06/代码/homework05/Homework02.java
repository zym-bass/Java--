package com.ujiuye.homework05;

import java.util.Random;
public class Homework02 {

	public static void main(String[] args) {
		// 1. flower数组用于表示扑克牌的花色,4种
		String[] flower = {"黑桃","红桃","梅花","方片"};
		// 2. pai数组用于存储牌
		String[] pai = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		// 3. 组合出52张扑克牌
		// index 表示puke数组中的索引位置
		int index = 0;
		String[] puke = new String[52];
		for(int index1 = 0; index1 < flower.length; index1++) {
			for(int index2 = 0; index2 < pai.length; index2++) {
				puke[index] = flower[index1] + pai[index2];
				System.out.print(puke[index] + "  ");
				index++;
			}
			System.out.println();
		}
		
		// 4. 生成0-51之间任意三个随机数
		Random ran = new Random();
		for(int i = 1; i <= 3; i++) {
			int number = ran.nextInt(52);
			String pukePai = puke[number];
			System.out.println("目前抽取第" + (number + 1) + "张牌, 为:" + pukePai);
		}	
	}
}
