package com.ujiuye.string;

public class Demo01_String {

	public static void main(String[] args) {
		// 1.  �����ַ�������, ��123��, ��hello��..., ����һ���ַ������͵Ķ���
        String s = "hello";
        String s1 = "hello";
        System.out.println(s == s1);// true
        
        String s2 = "hell";
        System.out.println(s1 == s2);// false
        
        String s3 = "Hello";
        System.out.println(s3 == s1);// false
	}
}
