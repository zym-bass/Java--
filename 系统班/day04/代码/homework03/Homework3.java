package com.ujiuye.homework03;

import java.util.Random;
import java.util.Scanner;
public class Homework3 {
	/*3. ģ��˫ɫ���� : 
	    ˫ɫ���Ϊ��ɫ�����ɫ��, ϵͳ�������һ��1-32֮��ĺ�ɫ���һ��1-16֮�����ɫ��,
	�ͻ�ͨ������¼�빺��ĺ�ɫ�����ɫ�����,��֤�ͻ��Ƿ��н�
	    1) ���ֻ��������, 3�Ƚ�,10��Ԫ
	    2) ���ֻ���к���, 2�Ƚ�, 30��Ԫ
	    3) ����������������, 1�Ƚ�, 50��Ԫ*/
	public static void main(String[] args) {
		  Random ran = new Random();
          // 1. ����1-32֮�������ɫ��
		  int xtRed = ran.nextInt(32)+1;
		  System.out.println("��ɫ��Ϊ:" + xtRed);
		  // 2. ����1-16֮�������ɫ��
		  int xtBlue = ran.nextInt(16)+1;
		  System.out.println("��ɫ��Ϊ:" + xtBlue);
		  
		  Scanner sc = new Scanner(System.in);
		  // 3. �ͻ������ɫ��
		  System.out.println("��ͻ�����һ��1-32֮��ĺ�ɫ��:");
		  int khRed = sc.nextInt();
		  // 4. �ͻ�������ɫ��
		  System.out.println("��ͻ�����һ��1-16֮�����ɫ��:");
		  int khBlue = sc.nextInt();
		  
		  // 5. ��֤�ͻ��Ƿ��н�
		  if(khRed == xtRed && khBlue == xtBlue) {
			  System.out.println("1�Ƚ�, 50��Ԫ");
		  }else if(khRed == xtRed) {
			  System.out.println("2�Ƚ�, 30��Ԫ");
		  }else if(khBlue == xtBlue) {
			  System.out.println("3�Ƚ�,10��Ԫ");
		  }else {
			  System.out.println("��Ǹ,û���н�");
		  }
	}
}
