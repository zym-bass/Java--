package com.ujiuye.stringbuilder;

public class Demo02_StringBuilder��ӹ��� {

	public static void main(String[] args) {
         //1. ������һ��StringBuilder�ַ���������
		 StringBuilder sb = new StringBuilder();
		 // 1) append : ĩβ�������
		 sb.append(true);
		 sb.append(3.14).append('z').append(new Object());
		 System.out.println(sb);
		 
		 // 2) insert : ָ������λ���������
		 sb.insert(3, "���");
		 System.out.println(sb);//tru���e3.14zjava.lang.Object@15db9742
		 
		 // 3) length : ��ȡ�������е��ַ�����
		 System.out.println(sb.length());// 36
		 sb.insert(sb.length(), "end");
		 System.out.println(sb);
		 
		 // 4) ��ȡ������������
		 System.out.println(sb.capacity());// 70
	}
}
