package com.ujiuye.cal;

public class Demo04_�߼������ {

	public static void main(String[] args) {
       int i = 12;
       boolean boo = i >= 5 && i <= 10;
       System.out.println(boo);// false
       
       boolean boo1 = i >= 5 || i <= 10;
       System.out.println(boo1);// true
       
       System.out.println(!true);//false
       System.out.println(!boo);// true
       
       System.out.println("----------------");
       
       // && �����Чԭ��
       // ��Ϊ��һ������ i <= 10 Ϊfalse , ��˵ڶ������ʽ���� ++i >= 10 ����û�м���ͱȽ�
       // ֱ�ӷ���false���
       boolean boo2 = i <= 10 && ++i >= 10;
       System.out.println(boo2);// false
       System.out.println(i);// 12
       
       // ||�����Чԭ��
       // ��һ���������ʽ true , �ڶ������ʽ, ����Ҫ������Ƚ�, ֱ�ӷ���true���
       boolean boo3 = i >= 5 || --i >= 5;
       System.out.println(boo3);// true
       System.out.println(i);// 12
	}
}
