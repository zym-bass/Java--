package com.ujiuye.staticdemo;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		// 1) sort(int[] arr): 将参数数组arr中的元素, 按照默认的升序进行排序, 从小到大排列, 方法没有返回值类型
	    int[] arr = {1,24,5,88,-8,9};
	    System.out.println(Arrays.toString(arr));
	    Arrays.sort(arr);
	    
	    // 2)toString(int[] arr) : 将参数数组arr中的每一个元素获取到, 以字符串形式返回, 方法返回值类型String
	    String s = Arrays.toString(arr); 
	    System.out.println(s);
	    
	    // 3) binarySearch(int[] arr, int key): 折半或者二分查找法, 查找key值在数组arr中出现索引位置; 
	    // 需要参数数组arr升序排列, 如果没有找到指定元素的索引, 返回一个负数
	    int index = Arrays.binarySearch(arr, 99);
	    //[-8, 1, 5, 9, 24, 88, 99]
	    System.out.println(index);// 3
	}
}
