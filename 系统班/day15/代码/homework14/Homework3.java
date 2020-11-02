package com.ujiuye.homework14;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;

public class Homework3 {
	/*3. ˫ɫ�����˫ɫ��ÿעͶע������6����ɫ������1����ɫ�������ɡ�
	��ɫ���1��33���������6�����ظ��ĺ��룻��ɫ������1��16���������1����
	�ͻ�ͨ������¼�빺��ĺ�ɫ��6��(���ظ�)����ɫ��1��, �жϿͻ����н�״��:
	  1) ������ɫ��, ��ɫ��ȫ������, 1�Ƚ� 100��
	  2) ������ɫ��, ��ɫ������3-5��, 2�Ƚ�50��
	  3) ������ɫ��, ��ɫ������1��, 3�Ƚ�20��
	  4) �������ȫ������û���н�
	Ҫ�� : �Ƚ����еĺ���ʱ, Ҫ����˳��Ҳ��Ϊ�Ƚ�����,����˳����ȫһ�²��������к������, 
	����ĳ����ɫ��û������, ������������ٱȽ�*/
	public static void main(String[] args) {
		Random ran = new Random();
        // 1. ����1-16֮���н���ɫ�����
		int xtBlue = ran.nextInt(16)+1;
		System.out.println("ϵͳ���ɵ��н���ɫ��Ϊ:" + xtBlue);
		// 2. ������һ���洢6�����ظ��н����򼯺�
		LinkedHashSet<Integer> xtRed = new LinkedHashSet<>();
		// 3. ��Ƴ�һ��ѭ��, ��������1-33֮��������ɫ��, �洢��xtRed������
		while(xtRed.size() < 6) {
			int number = ran.nextInt(33)+1;
			xtRed.add(number);
		}
		System.out.println(xtRed);
		
		Scanner sc = new Scanner(System.in);
		// 4. �ͻ�����1-16֮����ɫ��:
		System.out.println("��ͻ�����һ��1-16֮����ɫ��:");
		int khBlue = sc.nextInt();
		// ��֤�ͻ������������1-16֮��
		while(khBlue < 1 || khBlue > 16) {
			System.out.println("��������Χ����, ��ͻ�����һ��1-16֮����ɫ��:");
			khBlue = sc.nextInt();
		}
		
		// 5. �ͻ�����1-33֮��6�����ظ���ɫ��
		LinkedHashSet<Integer> khRed = new LinkedHashSet<>();
		while(khRed.size() < 6) {
			System.out.println("��ͻ�����1-33֮���6�����ظ��ĺ�ɫ��,Ŀǰ���ڹ����" + (khRed.size()+1) + "��");
			int number = sc.nextInt();
			if(number < 1 || number > 33) {
				System.out.println("����ĺ�ɫ��Χ����, �빺��1-33֮�����");
			}else {
				khRed.add(number);
			}
		}
		
		System.out.println(khRed);
		
		// 6. ��֤�ͻ����������ϵͳ�н���ƥ��̶�, �����н����
		if(khBlue == xtBlue) {// ��ɫ������
			// 7. ��ɫ���������xtRed khRed
			// ��Ϊset����û������, ���û������Ԫ�ض�λ, ���ǽ�set����ͨ��toArray(), ת���ɴ��������������ڽ��бȽ�
			Object[] xtArrRed = xtRed.toArray();
			Object[] khArrRed = khRed.toArray();
			
			// 8. �����һ������count, ��ʾ���к�ɫ�������
			int count = 0;
			for(int index = 0; index < xtArrRed.length; index++) {
				// ��ȡ��ÿһ��ϵͳ��ɫ��
				Integer xt = (Integer)xtArrRed[index];
				Integer kh = (Integer)khArrRed[index];
				if(xt == kh) {
					count++;
				}else {
					break;
				}
			}
			
			// 9. ��֤���к��������
			switch(count) {
			  case 6:
				System.out.println("1�Ƚ� 100��");
				break;
			  case 5:
			  case 4:
			  case 3:
				  System.out.println("2�Ƚ� 50��");
			      break;
			  case 1:
				  System.out.println("3�Ƚ� 10��");
				  break;
			  default:
				  System.out.println("û���н�");
			}
		}else {// û��������ɫ��, �н�ʧ��
			System.out.println("û���н�");
		}
	}
}
