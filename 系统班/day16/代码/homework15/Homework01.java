package com.ujiuye.homework15;

public class Homework01 {
	/*1.�����������󣬲��ô���ʵ�֣�
	(1)���������ַ�������{"010","3223","666","7890987","123123"}
	(2)�жϸ������ַ��������е������ַ����Ƿ��ǶԳ�(��һ�����ֺ����һ��������ȣ�
			�ڶ������ֺ͵����ڶ�����������ȵģ���������)�ģ���������
	(3)�磺010 �ǶԳƵģ�3223 �ǶԳƵģ�123123 ���ǶԳƵ�
	(4)���մ�ӡ�������жԳ��ַ����ĸ���*/
	public static void main(String[] args) {
          // 1.�����һ�������ַ�������
		  String[] arr = {"010","3223","666","7890987","123123"};
		  // count���ڼ���Գ��ַ����ĸ���
		  int count = 0;
		  // 2. ��ȡ��ÿһ���ַ���
		  for(String s : arr) {
			  // 3.���ַ���ת����һ���ַ�����
			  char[] ch = s.toCharArray();
			  // flag��ʾ��ǰ�ַ����Ƿ�Գ�, true ��ʾ�Գ�, ���򲻶Գ�
			  boolean flag = true;
			  // 4. ����ch����,��֤�Գ���
			  for(int beginIndex = 0, endIndex = ch.length-1; 
					  beginIndex < endIndex; beginIndex++, endIndex--) {
				  if(ch[beginIndex] != ch[endIndex]) {// ǰ���Ӧ����λ�õ�Ԫ�ز�һ��, ֤�����Գ�
					  flag = false;
					  break;
				  }
			  }
			  
			  // 5. ͨ��flag��ʾ��֤�ַ��Ƿ�Գ�
			  if(flag) {
				  count++;
				  System.out.println(s);
			  }
		  }
		  
		  System.out.println("�Գ��ַ�����:" + count);
	}

}
