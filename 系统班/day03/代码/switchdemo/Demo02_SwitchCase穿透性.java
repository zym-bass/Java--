package com.ujiuye.switchdemo;

public class Demo02_SwitchCase��͸�� {

	public static void main(String[] args) {
		/*���� : �����һ������, ���ڽ��й���������Ϣ��ƥ��, ���ݷ�Χ1-5,
		���������; ���ݷ�Χ6-7�����Ϣ��; �������ݱ���������������ʾ��Ϣ*/
		
		// weekday��ʾ��������
		int weekday = 13;
		/*switch(weekday) {
			case 1 : 
				System.out.println("������");
				break;
			case 2 : 
				System.out.println("������");
				break;
			case 3 : 
				System.out.println("������");
				break;
			case 4 : 
				System.out.println("������");
				break;
			case 5 : 
				System.out.println("������");
				break;
			case 6 : 
				System.out.println("��Ϣ��");
				break;
			case 7 : 
				System.out.println("��Ϣ��");
				break;
			default :
				System.out.println("������������,��Ҫ1-7֮������");
		}*/
		
		switch(weekday) {
			case 1 : 
			case 2 : 
			case 3 : 
			case 4 : 
			case 5 : 
				System.out.println("������");
				break;
			case 6 : 
			case 7 : 
				System.out.println("��Ϣ��");
				break;
			default :
				System.out.println("������������,��Ҫ1-7֮������");
	    }	
	}

}
