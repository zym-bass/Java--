package com.ujiuye.homework;
import java.util.Scanner;
public class HomeWork04 {
	public static void main(String[] args) {
		//��������ɨ����
		Scanner s = new Scanner(System.in);
		
		
		while(true) {
			menu();
			System.out.println("��ѡ�����ֶ�Ӧ�Ĺ��ܣ�");
			int number = s.nextInt();
			switch(number) {
			case 1:
				System.out.println("��ѡ���˾���");
				System.out.println("��������εĳ���");
				double long01 = s.nextDouble();
				System.out.println("��ѡ���˾��εĿ�");
				double wide = s.nextDouble();
				System.out.println("���ε����Ϊ��"+long01*wide);
				continue;
			case 2:
				System.out.println("��ѡ����������");
				System.out.println("�����������εĸߣ�");
				double number21 = s.nextDouble();
				System.out.println("��ѡ���������εĳ���");
				double number22 = s.nextDouble();
				System.out.println("�����ε����Ϊ��"+number22*number21/2);
				continue;
			case 3:
				System.out.println("��ѡ����԰");
				System.out.println("������԰�İ뾶��");
				double number31 = s.nextDouble();
				System.out.println("�����ε����Ϊ��"+number31*number31*3.14);
				continue;
			case 4:
				System.out.println("�˳����棬�ݰ�");
				return;
			}
		}
	}
	
	//�˵�
	public static void menu() {
		System.out.println("�������");
		System.out.println("1.����    2.������    3.԰    4.�˳�");
	}
	//����
	//public static void 
}
