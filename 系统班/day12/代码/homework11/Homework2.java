package com.ujiuye.homework11;

import java.util.Scanner;

public class Homework2 {
	/*2. ģ���û���¼
	   ��ȷ���û���Ϊadmin,����Ϊadm123
	   ����¼���û���������,һ�������λ���,���¼�����,��ʾʣ�¼��λ���,���һ����ʾ"��¼����������"
	   ��¼�ɹ�,��ʾ��¼�ɹ�*/
	public static void main(String[] args) {
         // 1. �����һ����ȷ�û���
		 String rightName = "admin";
		 // 2. �����һ����ȷ������
		 String rightPassword = "adm123";
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("һ�������λ���");
		 for(int i = 1; i <= 3; i++) {
			 System.out.println("�������û���:");
			 String inName = sc.nextLine();
			 System.out.println("����������:");
			 String inPassword = sc.nextLine();
			 
			 // 3. ��֤�������������ȷ�����Ƿ�ƥ��
			 // ʹ��equals�����Ƚ��ַ�������ʱ, �������ַ���������Ϊ�������ö���, ��ֹ������ָ���쳣
			 if(rightName.equals(inName) && rightPassword.equals(inPassword)) {
				 System.out.println("��¼�ɹ�");
				 break;
			 }else {
				 // 4. ��ʾ�ͻ���ʣ���λ���
				 if(i == 3) {
					 System.out.println("��¼����������");
				 }else {
					 System.out.println("ʣ��" + (3-i) + "�λ���");
				 }
			 }
		 }
	}
}
