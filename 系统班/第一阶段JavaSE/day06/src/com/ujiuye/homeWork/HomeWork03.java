/*
3.�����������󣬲��ô���ʵ�֣�
	(1)����һ��int���͵�һά���飬����Ϊ{6,2,9,15,1,5,20,7,18}
	(2)���������Ԫ�������һλԪ�ؽ��н���,��СԪ�����һλԪ�ؽ��н���������ӡ����*/
package com.ujiuye.homeWork;

public class HomeWork03 {
	public static void main(String[] args) {
		int[] i = {6,2,9,15,1,5,20,7,18};
		int maxdex = 0;
		int mindex = 0;
		for(int x = 0 ; x<i.length;x++) {
			if(i[maxdex] < i[x]) {
				maxdex = x;
			}
			if(i[mindex] > i[x]) {
				mindex = x;
			}
		}
		int x = i[i.length-1];
		i[i.length-1]  = i[maxdex];
		i[maxdex] = x;
		int y = i[0];
		i[0]  = i[mindex];
		i[mindex] = y;
		for(int a : i ) {
			System.out.print(a+"\t");
		}
	}

}
