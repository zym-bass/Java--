package com.ujiuye.fanxing;

import java.util.Arrays;

public class FanXingMethod {
	
	// ���� : ʵ��������������� index1��index2����λ��Ԫ�صĻ����滻
	public static<W> void changeArrayEle(W[] arr, int index1, int index2) {
		W temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
		System.out.println(Arrays.toString(arr));
	}
}
