package com.ujiuye.array;

public class Demo03_两个数组在内存中理解 {

	public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println(arr);// [I@15db9742
        arr[0] = 88;
        
        int[] arr1 = new int[3];
        System.out.println(arr1);// [I@6d06d69c
        System.out.println(arr1[0]);// 0
	}
}
