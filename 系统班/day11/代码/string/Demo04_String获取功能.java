package com.ujiuye.string;

public class Demo04_String��ȡ���� {

	public static void main(String[] args) {
        //1.length() : �����ַ������ַ��ĸ���(�����ַ�������), ����ֵ����int����
		System.out.println("".length());// 0
		System.out.println("  1".length());// 3
		// 2.charAt(int index) : ���ַ�����ָ��index����λ�ö�Ӧ���ַ���ȡ��, ����ֵchar����
		String s = "helloabc";
		char ch = s.charAt(3);
		System.out.println(ch);// l
		
		for(int index = 0; index < s.length(); index++) {
			System.out.print(s.charAt(index) + "  ");
		}
		
		System.out.println();
		
		//3.substring(int beginIndex) : �����������ַ�����beginIndex����λ�ÿ�ʼ, ��ȡ��ʣ�µ�ȫ��, ���ؽ�ȡ�������ַ���
		String s1 = s.substring(5);
		System.out.println(s1);//abc
		
		// 4.substring(int beginIndex, int endIndex) : �����������ַ�����beginIndex����λ�ÿ�ʼ,��ȡ��endIndex-1����, �м��ȡ�����ַ�����Ϊ�����ķ���ֵ���
		// ע�� : JDK�ṩ����������, �����ͬʱ�ڲ�����������λ, ͨ��������ʼ��������������������
		String s2 = s.substring(1,6);//elloa
		System.out.println(s2);
		
		// 5.indexOf(String str): ��ȡ�����ַ���str�ڷ��������ַ����е�һ�γ��ֵ�����λ��, ������int��������ֵ���; ���û���ҵ�Ŀ����ַ���str, ����-1
		String name = "��������";
		System.out.println(name.indexOf("123"));// -1
		System.out.println(name.indexOf("����"));// 2
		
		// 6.indexOf(String str, int beginIndex) : ��beginIndex����λ�ÿ�ʼ���Ѱ��, str��һ�γ����ڷ��������ַ����е�����λ��
	    System.out.println(name.indexOf("����", 1));// 2
	}
}
