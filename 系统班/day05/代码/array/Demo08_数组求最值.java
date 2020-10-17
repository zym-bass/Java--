package com.ujiuye.array;

public class Demo08_数组求最值 {

	public static void main(String[] args) {
         int[] arr = {112,13,55,7,66,88};
         // int[] arr = {};
         
         if(arr != null && arr.length > 0) {
        	 // 1. 设置一个默认最大值, 设置0索引位默认值
             int max = arr[0];
             // 2. 获取到除了0索引之外的剩余所有元素
             for(int index = 1; index < arr.length; index++) {
            	 int ele = arr[index];
            	 // 3. 将数组中的每一个元素与默认最大值max进行比较, 将较大值赋值给max
            	 if(ele > max) {
            		 max = ele;
            	 }
             }
             System.out.println(max);
             
         }else {
        	 System.out.println("数组为null或者数组中没有元素, 不能求最值");
         }
	}
}
