package com.ujiuye.homework03;

import java.util.Scanner;
public class Homework4 {
	/*4. ����¼��һ���·ݣ��������·ݵļ���
	3��4��5���Ǵ�����6��7��8�����ļ���9��10��11�＾��12��1��2����
	�������֣�û���κμ��ڣ���ʾ"�������ݴ���"*/
	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("������1-12֮������, ���ڽ����·�ƥ��:");
         // yue��ʾ�·�
         int yue = sc.nextInt();
         switch(yue) {
            case 3:
            case 4:
            case 5:
            	System.out.println("����");
            	break;
            case 6:
            case 7:
            case 8:
            	System.out.println("�ļ�");
            	break;
            case 9:
            case 10:
            case 11:
            	System.out.println("�＾");
            	break;
            case 12:
            case 1:
            case 2:
            	System.out.println("����");
            	break;
            default : 
            	System.out.println("�����·���������");
         }
	}
}
