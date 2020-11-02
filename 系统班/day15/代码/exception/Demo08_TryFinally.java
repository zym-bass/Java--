package com.ujiuye.exception;

public class Demo08_TryFinally {

	public static void main(String[] args) {
		try {
			int[] arr = {12};
	        System.out.println(arr[0]);
		}finally {
			System.out.println("Œ“±ÿ–Î÷¥––");
		}
		
		System.out.println("game over");
	}
}
