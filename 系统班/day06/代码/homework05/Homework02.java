package com.ujiuye.homework05;

import java.util.Random;
public class Homework02 {

	public static void main(String[] args) {
		// 1. flower�������ڱ�ʾ�˿��ƵĻ�ɫ,4��
		String[] flower = {"����","����","÷��","��Ƭ"};
		// 2. pai�������ڴ洢��
		String[] pai = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		// 3. ��ϳ�52���˿���
		// index ��ʾpuke�����е�����λ��
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
		
		// 4. ����0-51֮���������������
		Random ran = new Random();
		for(int i = 1; i <= 3; i++) {
			int number = ran.nextInt(52);
			String pukePai = puke[number];
			System.out.println("Ŀǰ��ȡ��" + (number + 1) + "����, Ϊ:" + pukePai);
		}	
	}
}
