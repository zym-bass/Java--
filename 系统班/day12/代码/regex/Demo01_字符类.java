package com.ujiuye.regex;

public class Demo01_�ַ��� {

	public static void main(String[] args) {
        // 1.�����һ��������ʽ
		String regex = "[abc]";
		// 2. �����һ����Ҫ��֤�ַ���
		String s = "a";
		
		System.out.println(s.matches(regex));// true
		System.out.println("b".matches(regex));// true
		System.out.println("ab".matches(regex));//  false
		System.out.println("1".matches(regex));// false
		
		System.out.println("------------");
		
		String regex2 = "[^abc]";
		System.out.println("b".matches(regex2));// false
		System.out.println(" ".matches(regex2));// true
		
		System.out.println("+++++++++++++");
		String regex3 = "[a-zA-Z0-9]";
		System.out.println("X".matches(regex3));// true
		System.out.println("?".matches(regex3));// false
		System.out.println("-1".matches(regex3));// false
	}
}
