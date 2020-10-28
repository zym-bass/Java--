package com.ujiuye.stringbuilder;

public class Demo01_StringBuilder���� {

	public static void main(String[] args) {
		// "a" "b" "ab" "c" "abc" "d" "abcd" "e" "abcde"
		// ��Ҫ9�鳣���ؿռ�, �Ƚ��˷��ڴ�, ���StringBuilder����Ϊ�˽���ַ���ƴ���˷��ڴ�����
		String s = "a" + "b" + "c" + "d" + "e";
		
		// 1.StringBuilder() : ������һ���ַ���������, Ĭ�ϳ�ʼ������СΪ16�ַ�
		StringBuilder sb = new StringBuilder();
		System.out.println(sb);
		
		// 2.StringBuilder(int count) : ������һ���ַ���������,��ʼ������СΪ����count
		StringBuilder sb1 = new StringBuilder(56);
		
		// 3.StringBuilder(String str) : ������һ���ַ���������, ����Ϊstr.length() + 16
		StringBuilder sb2 = new StringBuilder("abc");
		System.out.println(sb2);// abc
	}
}
