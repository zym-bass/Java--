package com.ujiuye.stringbuilder;

public class Demo04_StringBuilder�滻�ͷ�ת {

	public static void main(String[] args) {
		 StringBuilder sb = new StringBuilder("helloworld");
		 //1.replace(int beginIndex, int endIndex, String str) : ��beginIndex����λ�ÿ�ʼ��endIndex-1����λ�ý���, �м��ַ�����ʹ���ַ���str�����滻,���ص�ǰ���ڲ�����StringBuilder���Ͷ�����
		 sb.replace(1, 4, "�滻");
		 System.out.println(sb); // h�滻oworld
		 
		 // 2.reverse() : ��StringBuilder�е��ַ����ݽ�����������,���ص�ǰ���ڲ�����StringBuilder���Ͷ�����
		 sb.reverse();
		 System.out.println(sb);
	}
}
