package com.ujiuye.array;

public class Demo05_数组索引越界异常 {

	public static void main(String[] args) {
         int[] arr = {12,13,0,99,88,-7};// 元素有6个, 索引范围0-5
         //ArrayIndexOutOfBoundsException
         //数组    索引   超出    边界     异常
         //arr[-1] = 72;
         
         // arr[6] = 99; 越界
         System.out.println(arr.length);// 6
         
         int ele = getArrayElement(arr,5);
         System.out.println(ele);// -7
	}
	
	// 定义出一个方法功能 : 获取到指定int[]中某一个索引位置元素值
	public static int getArrayElement(int[] arr, int index) {
		// 判断: 使用index索引在arr中存在才能使用
		// index >= 0  index <= 5
		// index >= 0  index < 6
		if(index >= 0 && index < arr.length) {
			return arr[index];
		}else {
			System.out.println(index + "索引不在arr数组正确索引范围之内, 无法操作, 返回默认值为0");
			return 0;
		}
		
	}

}
