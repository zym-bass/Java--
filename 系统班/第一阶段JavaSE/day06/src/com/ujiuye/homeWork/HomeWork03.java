/*
3.分析以下需求，并用代码实现：
	(1)定义一个int类型的一维数组，内容为{6,2,9,15,1,5,20,7,18}
	(2)将数组最大元素与最后一位元素进行交换,最小元素与第一位元素进行交换，并打印数组*/
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
