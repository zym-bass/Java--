package com.ujiuye.homework4;

import java.util.Random;
import java.util.Scanner;
public class Homework02 {
	/*2. �������ճ������У�������������������ֵ���Ϸ���ǳ�����Ȥ����������ͨ��java�������������Ϸ��д������
	   �����ְ�����Ҫ���ʲô���Ĺ����أ�����˼�壬�����Ϸ������������֡������¡�
	   ��Ϸ�������£�
	       ��̨Ԥ������һ��1-100֮�����������û�����¼�������
	       ����¶��ˣ���ӡ����ϲ��������ˡ�
	       ����´���
		�´��ˣ���ӡ��sorry�����´���!��
		��С�ˣ���ӡ��sorry������С��!��
	       ֱ�����ֲµ�Ϊֹ*/
	public static void main(String[] args) {
         Random ran = new Random();
         // 1. ����1-100֮����������
         int number = ran.nextInt(100)+1;
         System.out.println(number);
         
         Scanner sc = new Scanner(System.in);
         // 2. ��Ϊ�ͻ��¶��ٴο��Բ¶�δ֪, ��Ƴ�һ��while(true)
         System.out.println("��ͻ�����һ��1-100֮�������:");
         while(true) {
        	 int inNum = sc.nextInt();
        	 if(inNum == number) {
        		 System.out.println("�¶���");
        		 break;
        	 }else if(inNum > number) {
        		 System.out.println("�´���");
        	 }else {
        		 System.out.println("��С��");
        	 }
         }
	}
}
