package com.ujiuye.integer;

public class Demo02_Integer���÷��� {

	public static void main(String[] args) {
         Integer i = new Integer(26);
         // 1. byteValue() : ��Integer����������ʾ������ת���ɻ�����������byte
         byte b = i.byteValue();
         System.out.println(b);
         
         // 2. static parseInt(String s): ���ַ���s��ʾ����ֵת����int�������� 
         int num = Integer.parseInt("-99");
         System.out.println(num + 1);
         
         // 3. ��int����ת����String����     -99 + ""
         String s = String.valueOf(-99);
         System.out.println(s + 1);// -991
         
         // 4. ʮ����ת������������
         System.out.println(Integer.toBinaryString(5));// 101
         System.out.println(Integer.toOctalString(10));// 12
         System.out.println(Integer.toHexString(26));//1a      
	}
}
