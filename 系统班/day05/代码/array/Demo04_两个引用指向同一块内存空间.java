package com.ujiuye.array;

public class Demo04_��������ָ��ͬһ���ڴ�ռ� {

	public static void main(String[] args) {
         int[] arr = new int[3];
         System.out.println(arr);// [I@15db9742
         arr[0] = 88;
         
         int[] arr1 = arr;// ��ֵ, ��arr���ڴ��е�ַ��ֵ��arr1, ���arr��arr1ָͬһ���ڴ�ռ�
         System.out.println(arr1);// [I@15db9742
         System.out.println(arr1[0]);// 88
	}

}
