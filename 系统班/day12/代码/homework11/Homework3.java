package com.ujiuye.homework11;

public class Homework3 {
	/*3.�����������󣬲��ô���ʵ��
	(1)�����ַ���Hello12345World
	            hELLO*****wORLD
	(2)���ַ����д�д��ĸ���Сд��ĸ��Сд��ĸ��ɴ�д��ĸ�������ַ���"*"����
			����:
				��������hELLO*****wORLD
				
				*
				*  ����:
				*   1) ��Ҫ��ȡ���ַ����е�ÿһ���ַ�, ����֪������ַ��Ǵ�С, Сд, ��������
				*      toCharArray()---> char[] --->���������ȡ���ַ����е�ÿһ���ַ�
				*   2) ��ȡ��ÿһ���ַ�, �ж�����ַ���ʲô?
				*      ��д��ĸ :  c >= 65  && c <= 90;  c >= 'A' && c <= 'Z'  toLowerCase()
				*      Сд��ĸ 
				*      ����
				*
				*/
	public static void main(String[] args) {
        // 1. �����һ���ַ���
		String s = "Hello12345World";
		// 2. ���ַ���ת�����ַ�����
		char[] ch = s.toCharArray();
		// �����һ�����ս���ַ���
		String endStr = "";
		// 3.����ch����, ��ȡ���ַ����е�ÿһ���ַ�
		for(int index = 0; index < ch.length; index++) {
			// c��ʾ�ַ����е�ÿһ���ַ�
			char c = ch[index];
			// 4. ��֤�ַ�c��ʲô��Χ
			if(c >= 'A' && c <= 'Z') {// c�Ǵ�д��ĸ, ���Сд(toLowerCase()--->String)
				// 5. ���ַ�cת�����ַ�������
				endStr = endStr + String.valueOf(c).toLowerCase();// h
			}else if(c >= 'a' && c <= 'z') {// c��Сд��ĸ, ��ɴ�д
				endStr = endStr + String.valueOf(c).toUpperCase(); // E
			}else {
				endStr = endStr + "*";
			}
		}
		System.out.println(endStr);
	}
}
