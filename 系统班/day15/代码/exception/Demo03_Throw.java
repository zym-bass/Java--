package com.ujiuye.exception;

public class Demo03_Throw {

	public static void main(String[] args) {
		// int[] arr = {1,2,3,4};
		int[] arr = null;
		getArrayEle(arr,6);
	}
	
	// 定义出一个方法 : 求int[]数组中执行索引位置元素的结果
	public static void getArrayEle(int[] arr, int index) {
		
		// 1. 提供参数数组arr不能为null
		if(arr == null) {// 不合符实际情况场景
			throw new NullPointerException("数组不能为null");
		}
		
		// 2.提供index索引位置需要在arr数组中存在
		if(index < 0 || index > arr.length-1) {
			throw new ArrayIndexOutOfBoundsException(index + "索引在数组arr中不存在");
		}
		
		int ele = arr[index];
		System.out.println(ele);
	}
}
