package com.ujiuye.homework12;

import java.util.Arrays;

public class Homework1 {
	/*1. 自己定义一个方法，功能如下：给定一个数组，将数组内容转换成一个字符串
	(不允许使用Arrays.toString方法直接实现)
	例如：数组为int[] arr = {1, 2, 3}，转换出的字符串结果为[1, 2, 3]  ,
	使用StringBuilder实现题目中的字符串拼接过程
	
	*  分析 :
	*   1) 开头, 需要拼接一个[  , StringBuilder拼接比较合适类型使用
	*   2) 从数组中获取到每一个元素, 拼接
	*                验证, 当前数据是不是数组中的最后一个元素
	*                     是, 元素后拼接]
	*                     不是, 元素后拼接,
	*
	*/
	public static void main(String[] args) {
         int[] arr = {1,2,3};
         // 1. sb用于进行数组中元素的拼接
         StringBuilder sb = new StringBuilder("[");
         // 2. 遍历数组, 获取出数组中的每一个元素
         for(int index = 0; index < arr.length; index++) {
        	 int ele = arr[index];
        	 // 3. 验证ele是不是最后一个元素
        	 if(index == arr.length-1) {
        		 sb.append(ele + "]");
        	 }else {
        		 sb.append(ele + ",");
        	 }
         }
         
         System.out.println(sb);
	}
}
