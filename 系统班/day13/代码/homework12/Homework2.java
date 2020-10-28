package com.ujiuye.homework12;

public class Homework2 {
	/*2、定义一个方法，功能如下：给定一个字符串，返回该字符串的反转形式
	例如：字符串为abcdef，返回结果为fedcba*/
	public static void main(String[] args) {
		String s = "abcdef";
		//          fedcba
		System.out.println(reverseString(s));
	}
	
	public static String reverseString(String s) {
		/*StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString();*/
		
		return new StringBuilder(s).reverse().toString();
	}
}
