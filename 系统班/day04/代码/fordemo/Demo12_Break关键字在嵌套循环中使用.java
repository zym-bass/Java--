package com.ujiuye.fordemo;

public class Demo12_Break�ؼ�����Ƕ��ѭ����ʹ�� {

	public static void main(String[] args) {
		/*���� : ����һ����������ָ��, ÿ��Ҫ��ѧԱ��5Ȧ; 
	        ʵ����ѧԱÿ��ָ��ֻ��3Ȧ��ȥ������һ��ָ��, 
	        ������Ԥ����Ȧ��ѧԱʵ����Ȧ����ʵ�ֳ���*/
		
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.println("������" + i + "�η���ָ��, ĿǰѧԱ�ܵ��˵�" + j + "Ȧ");
                if(j == 3) {
					break;
				}
			}
		}
	}
}
