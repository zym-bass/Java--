package com.ujiuye.fordemo;

public class Demo11_Ƕ��ѭ��ֱ�����ǰ��� {
/*	����2 :��ӡ������ͼ��
				*
				**
				***
				****
				*****
	*
	*  ���� : 
	*    ��һ��, ��ӡ1����  
	*    �ڶ���, ��ӡ2����  
	*    ������, ��ӡ3����  
	*    ������, ��ӡ4����
	*    ������, ��ӡ5����
	*    
	*    ���� : ÿһ�д�ӡ����������, �뵱ǰ������һ��
	**/
	public static void main(String[] args) {
         for(int i = 1; i <= 5; i++) {// ���ѭ����ʾĿǰ��ӡ������
        	 for(int j = 1; j <= i; j++) {
        		 System.out.print("*");
        	 }
        	 System.out.println();
         }
	}
}
