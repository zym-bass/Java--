package com.ujiuye.switchdemo;

public class Demo01_SwitchCase��� {

	public static void main(String[] args) {
		// ���� : �����һ������, ���ڽ�������ƥ��, ���ݷ�Χ1-7,
		// ��Ӧƥ������һ��������, �������1-7��Χ, ��ô�������ݴ�����ʾ��Ϣ
		
		// weekday��ʾ��Ӧ������ֵ
		int weekday = 12;
		switch(weekday) {
			case 1:
				   System.out.println("����һ");
				   break;
			case 2:
				   System.out.println("���ڶ�");
				   break;
			case 3:
				   System.out.println("������");
				   break;
			case 4:
				   System.out.println("������");
				   break;
			case 5:
				   System.out.println("������");
				   break;
			case 6:
				   System.out.println("������");
				   break;
			case 7:
				   System.out.println("������");
				   break;
			default :
				  System.out.println("������������,��Ҫ1-7֮������");
		}
	}
}
