package com.ujiuye.homework11;

public class Homework1 {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "he"+"llo";// "hello"
		String s4 = new String("hello");
		String s5 = new String("hello");
		// char[] ch = new char[]{'h','e','l','l','o'};
		char[] ch = {'h','e','l','l','o'};
		
		System.out.println(s1 == s2);// true
		System.out.println(s2 == s3);// true
		System.out.println(s1 == s4);// false
		System.out.println(s4 == s5);// false
		// �Ƚϵ���ch������s1�ַ������ڴ��ַ : 
		// ch�����ڶ��ڴ���ռ�пռ�, s1��Ϊ�ַ��������ڳ�������ռ�пռ�
		System.out.println(ch.equals(s1));// false
	}
}
