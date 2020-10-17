package com.ujiuye.array;

public class Demo06_空指针异常 {

	public static void main(String[] args) {
         int[] arr = null;
         int[] arr1 = {};
         // NullPointerException
         //  空    指针        异常
         // System.out.println(arr.length);
         
        /* if(arr != null) {
        	 System.out.println(arr[0]);
         }else {
        	 System.out.println("数组不能设置为null,因为null数组无法操作");
         }*/
         getArrayEle(arr,1);
	}
	
	// 定义出一个方法功能 : 获取到指定int[]中某一个索引位置元素值
	public static int getArrayEle(int[] arr, int index) {
		// 实际开发中, 会先验证数组存在, 再验证数组中有元素
		if(arr != null && arr.length > 0) {
			if(index >= 0 && index < arr.length) {
				return arr[index];
			}else {
				System.out.println(index + "索引不在arr数组正确索引范围之内, 无法操作, 返回默认值为0");
				return 0;
			}
		}else {
			System.out.println("数组不能设置为null,因为null数组无法操作");
			return 0;
		}
		
		
		
		
	}
}
