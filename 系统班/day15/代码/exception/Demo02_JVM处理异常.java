package com.ujiuye.exception;

public class Demo02_JVM�����쳣 {

	public static void main(String[] args) {
		getArrayEle();
	}
	
	public static void getArrayEle() {
		int[] arr = {12};
		int ele = arr[3];
		System.out.println(ele);
	}
}
