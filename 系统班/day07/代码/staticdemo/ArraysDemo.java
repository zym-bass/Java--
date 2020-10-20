package com.ujiuye.staticdemo;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		// 1) sort(int[] arr): ����������arr�е�Ԫ��, ����Ĭ�ϵ������������, ��С��������, ����û�з���ֵ����
	    int[] arr = {1,24,5,88,-8,9};
	    System.out.println(Arrays.toString(arr));
	    Arrays.sort(arr);
	    
	    // 2)toString(int[] arr) : ����������arr�е�ÿһ��Ԫ�ػ�ȡ��, ���ַ�����ʽ����, ��������ֵ����String
	    String s = Arrays.toString(arr); 
	    System.out.println(s);
	    
	    // 3) binarySearch(int[] arr, int key): �۰���߶��ֲ��ҷ�, ����keyֵ������arr�г�������λ��; 
	    // ��Ҫ��������arr��������, ���û���ҵ�ָ��Ԫ�ص�����, ����һ������
	    int index = Arrays.binarySearch(arr, 99);
	    //[-8, 1, 5, 9, 24, 88, 99]
	    System.out.println(index);// 3
	}
}
