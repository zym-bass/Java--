package com.ujiuye.string;

public class Demo06_String�������� {

	public static void main(String[] args) {
       // 1.replace(String old, String newStr): ���ַ��������е�old�ַ��������滻��newStr�ַ�������, ���滻֮����ַ��������Ϊ�����ķ���ֵ
	   String s = "helloworld";
	   String newStr = s.replace("l", "*");
	   System.out.println(newStr);//he**owor*d
	   
	   // 2.trim() : ���ַ�����ǰ��Ŀո�ȥ����, �ַ����пո��޷�ȥ��, ��ȥ���ո���ַ��������Ϊ�����ķ���ֵ
	   String s1 = "  123  abc            ";
	   System.out.println(s1.trim());
	}
}
