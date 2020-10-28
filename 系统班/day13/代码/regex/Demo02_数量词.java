package com.ujiuye.regex;

public class Demo02_������ {

	public static void main(String[] args) {
		/*���� : ��֤�ͻ��ĵ绰���� : 13566778899
	      Ҫ�� : �绰������ȫ����; ��һλ������1; 
	      �ڶ�λ������3-9֮�����ֵ; ʣ�¿�������������; ���ȱ���Ϊ11λ;*/
		
		String telRegex = "[1][3-9]\\d{9}";
		System.out.println("13822223344".matches(telRegex));// true
		System.out.println("1382222334".matches(telRegex));// false
		System.out.println("43822223344".matches(telRegex));// false
		System.out.println("11822223344".matches(telRegex));// false
		System.out.println("138222233 4".matches(telRegex));// false
		
		System.out.println("-------------");
		
		/*���� : ��֤QQ����ע�� : 2345678
	                 Ҫ�� : ȫ����; ��һλ������0; ����5-15λ֮��*/
		String qqRegex = "[1-9][0-9]{4,14}";
		System.out.println("962431796".matches(qqRegex));//true
		System.out.println("012345".matches(qqRegex));// false
		System.out.println("9624".matches(qqRegex));//false
		System.out.println("962431796a".matches(qqRegex));//false
		
	}

}
