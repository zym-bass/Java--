package com.ujiuye.array;

public class Demo07_数组遍历 {

	public static void main(String[] args) {
		int[] arr = {66,1234,0,-98};
		getAllElementFromArray(arr);
	}
	
	// 定义出一个方法 : 功能就是可以获取到int[]数组中的每一个元素(遍历)
	public static void getAllElementFromArray(int[] arr) {
		 if(arr != null && arr.length > 0) {
			 // 1. 将数组索引位作为循环依据
			 for(int index = 0; index <= arr.length-1; index++) {
				 // 2. 在循环内部, 可以使用数组名[index]获取数组元素
				 int ele = arr[index];
				 System.out.println(ele);
			 }
		 }else {
			 System.out.println("数组为null或者数组中没有元素, 那么无效遍历");
		 }
	}
}
