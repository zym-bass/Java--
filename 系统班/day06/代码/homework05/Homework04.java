package com.ujiuye.homework05;

import java.util.Scanner;
public class Homework04 {
	/*ע�� : 
		������Ҫ���볤�Ϳ�, �����ʽ : �� * ��
		��������Ҫ����׺͸�,�����ʽ : (��*��)/2
		Բ����Ҫ����뾶r, �����ʽ : 3.14 * r * r*/
	public static void main(String[] args) {
         
		  Scanner sc = new Scanner(System.in);
		  // 1. ��Ϊ֧�����޴�ͼ�������ȡ, ��Ƴ�һ����ѭ��
		  while(true) {
			  System.out.println("�������");
			  System.out.println("1.����   2.������   3.Բ��   4.�˳�");
			  System.out.println("��ѡ�����ֶ�Ӧ�Ĺ��� (1-4): ");
			  // 2. ��¼��һ������
			  int number = sc.nextInt();
			  // 3. �ж�number��Χ,��������ͼ��
			  if(1 == number) {
				  System.out.println("��ѡ���˾���");
				  System.out.println("��������εĳ�:");
				  int chang = sc.nextInt();
				  System.out.println("��������εĿ�:");
				  int kuan = sc.nextInt();
				  System.out.println("���ε����Ϊ : " + chang * kuan);
			  }else if(2 == number) {
				  System.out.println("��ѡ����������");
				  System.out.println("�����������εĵ�:");
				  int di = sc.nextInt();
				  System.out.println("�����������εĸ�:");
				  int gao = sc.nextInt();
				  System.out.println("�����ε����Ϊ : " + (di * gao)/2.0);
			  }else if(3 == number) {
				  System.out.println("��ѡ����Բ��");
				  System.out.println("������Բ�εİ뾶:");
				  int r = sc.nextInt();
				  System.out.println("Բ�ε����Ϊ : " + 3.14 * r * r);
			  }else if(4 == number) {
				  System.out.println("�˳�ϵͳ,ллʹ��");
				  break;
			  }else {
				  System.out.println("������������");
			  }
		  }
	}
}
