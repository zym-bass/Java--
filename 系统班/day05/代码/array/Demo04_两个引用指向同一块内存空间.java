package com.ujiuye.array;

public class Demo04_两个引用指向同一块内存空间 {

	public static void main(String[] args) {
         int[] arr = new int[3];
         System.out.println(arr);// [I@15db9742
         arr[0] = 88;
         
         int[] arr1 = arr;// 赋值, 将arr在内存中地址赋值给arr1, 如此arr与arr1指同一块内存空间
         System.out.println(arr1);// [I@15db9742
         System.out.println(arr1[0]);// 88
	}

}
