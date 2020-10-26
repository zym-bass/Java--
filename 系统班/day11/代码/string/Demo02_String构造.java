package com.ujiuye.string;

public class Demo02_String���� {

	public static void main(String[] args) {
         // 1. String()
		 String s = new String();// ""  String s1 = "";
		 System.out.println(s + "---");
		 
		 // 2. String(String str)
		 // s1ͨ��new��������, s1ָ����ڴ�ռ��ַ
		 String s1 = new String("123");
		 System.out.println(s1);
		 // s2ָ���������ڴ��ַ, s1��s2��������ͬ, ���ǵ�ֵַ��ͬ��
		 String s2 = "123";
		 System.out.println(s1 == s2);// false
		 
		 // 3.String(byte[] b) : ���ֽ�����ת����һ���ַ���; ���ֽ����ݲο�ƽ̨Ĭ�ϱ����, ���ֽ�ת���ɶ�Ӧ���ַ�, ƴ���ַ��γ�һ���ַ���
		 byte[] b = {97,98,99,100}; // abcd
		 String s3 = new String(b);
		 System.out.println(s3);// abcd
		 
		 /*4.String(byte[] b, int beginIndex, int length): ���ֽ������һ����ת�����ַ���
		   a : beginIndex��ʾ���ֽ������ĳһ������λ�ÿ�ʼ
		   b : length ��ʾ��Ҫ��ȡ�ĳ���(����) */
		 String s4 = new String(b,1,2); 
		 System.out.println(s4);// bc
		 
		 // 5.String(char[] ch) : ���ַ�����ת����һ���ַ���; ֱ�ӽ�����ch�ַ������е�ÿһ���ַ���ȡ��, ƴ�ӳ�һ���ַ���
	     char[] ch = {'1','A','>','��','z'};
	     String s5 = new String(ch);
	     System.out.println(s5);//1A>��z
	     
	     /*6.String(char[] ch, int beginIndex, int length): ���ַ������һ����ת�����ַ���; 
	     a : beginIndex��ʾ���ֽ������ĳһ������λ�ÿ�ʼ
	     b : length ��ʾ��Ҫ��ȡ�ĳ���(����)*/
	     String s6 = new String(ch,0,3);
	     System.out.println(s6);// 1A>
	}
}
