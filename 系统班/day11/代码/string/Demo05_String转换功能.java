package com.ujiuye.string;

import java.util.Arrays;

public class Demo05_Stringת������ {

	public static void main(String[] args) {
        
		String s = "ABCDEF";
		// 1.getBytes() : �����������ַ���ת�����ַ�, ��ͨ��ƽ̨Ĭ�ϱ�����ַ�ת�����ֽ�����, ��ת������洢��byte[]��
		byte[] b = s.getBytes();
		System.out.println(Arrays.toString(b));//[65, 66, 67, 68, 69, 70]
		
		// 2.toCharArray() : �����������ַ���ת�����ַ�����,  ��ת������洢��char[]��
		char[] ch = s.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		for(int index = 0; index < ch.length; index++) {
			System.out.print(ch[index] + "  ");
		}
		System.out.println();
		
		// 3.toUpperCase() : �����������ַ����е������ַ�(��ĸ)ת���ɴ�д, ����ת��֮������ַ������
		String s1 = "HelloWorld";
		System.out.println(s1.toUpperCase());// HELLOWORLD
		
		// 4. toLowerCase() : �����������ַ����е������ַ�(��ĸ)ת����Сд, ����ת��֮������ַ������
		System.out.println(s1.toLowerCase());// helloworld
		
		// 5.static valueOf(Object obj) : ���Խ�����������������ת�����ַ�������, �������������ط���, Ҳ���Խ�������������ת�����ַ�������
		String result = String.valueOf(10) + 1;
		System.out.println(result);// 101
		
		String ss = String.valueOf(new Object());
		System.out.println(ss);
	}
}
