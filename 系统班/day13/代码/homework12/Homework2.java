package com.ujiuye.homework12;

public class Homework2 {
	/*2������һ���������������£�����һ���ַ��������ظ��ַ����ķ�ת��ʽ
	���磺�ַ���Ϊabcdef�����ؽ��Ϊfedcba*/
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
