package com.ujiuye.variable;

public class Demo06_�ַ�������ASCII����� {

	public static void main(String[] args) {
		char ch = 'a';
		// 1) ch�ο������, �õ�97,��������Ϊint
		//  2) 97 + 5 = 102(int����)
		int result = ch + 5;
		System.out.println(result);// 102
		
		char ch1 = (char)result;
		System.out.println(ch1);// f
	}
}
