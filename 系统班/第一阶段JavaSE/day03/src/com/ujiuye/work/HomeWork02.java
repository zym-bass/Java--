/*����¼������x��ֵ���������Ӧ��yֵ�������
		
		* x>=3		y = 2 * x + 1;
		* -1<x  ���� x<3	y = 2 * x;
		* x<=-1		y = 2 * x - 1;*/

package com.ujiuye.work;
//�������뵼��
import java.util.Scanner;

public class HomeWork02 {
	
	//��������ɨ���� a
	private static Scanner a;//˽�о�̬����
	
	public static Scanner getA() {
		return a;
	}

	public static void setA(Scanner a) {
		HomeWork02.a = a;
	}
	//���
	public static void main(String[] args) {
		
		//aΪ����������
		 a = new Scanner(System.in);
		//��������
		System.out.print("������һ��������");
		int x = a.nextInt();
		int y = 0 ;
		if(x>=3) {
			y = 2*x + 1 ;
		}else if( x > -1 && x < 3) {
			y = 2*x ;
		}else if(x < -1) {
			y = 2*x - 1 ;
		}
		System.out.println(y);
	}

}
