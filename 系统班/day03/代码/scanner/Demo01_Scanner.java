package com.ujiuye.scanner;

// 1. ����Scanner�������ڵ�·��
import java.util.Scanner;
public class Demo01_Scanner {

	public static void main(String[] args) {
		 /*  
		  * ���� : ͨ������¼��һ������, ��ȡ�����������2��
		    */
		
		// 2. ������һ��Scanner���Ͷ���
		Scanner sc = new Scanner(System.in);
		// 3. ����Scanner�з�������nextInt()
		System.out.println("������һ������: ");
		int count = sc.nextInt();
		System.out.println(count + "��ֵ��2��Ϊ: " + count * 2);
        
		
	}

}
