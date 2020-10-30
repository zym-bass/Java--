package com.ujiuye.fanxing;

import java.util.Arrays;

public class FanXingMethod {
	
	// 功能 : 实现任意类型数组的 index1和index2索引位置元素的互相替换
	public static<W> void changeArrayEle(W[] arr, int index1, int index2) {
		W temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
		System.out.println(Arrays.toString(arr));
	}
}
