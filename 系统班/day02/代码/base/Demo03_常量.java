package com.ujiuye.base;

public class Demo03_���� {

	public static void main(String[] args) {
        // ��������
		System.out.println(5);
		// ��������
		System.out.println(5.2);
		// �ַ�����
		System.out.println('a');
		System.out.println('W');
		System.out.println('9');
		System.out.println(';');
		System.out.println('��');
		// System.out.println('-1'); �ⲻ��һ���ַ�, �����ַ�
		
		// ��������
		System.out.println(true);
		System.out.println(false);
		
		// �ַ�������
		System.out.println("123abc");
		String s = null;
		System.out.println(s);
		System.out.println("12  ??00--456YU�㼸��?");
		System.out.println("2020��-10��-13��");
		
		System.out.println("--------------");
		
		// �ַ��������ļӷ�����
		System.out.println("6"+ 5);// "65"
		// 1) "6" + 5 = "65"  2)"65" + 4 = "654" 
		System.out.println("6"+ 5 + 4); // "654"
		// 1) 5 + 4 = 9  2) "6" + 9 = "69"
		System.out.println("6" + (5 + 4));// "69"
		// 1) 5 + 4 = 9  2) 9 + "6" = "96"  3) "96" + 1 = "961"
		System.out.println(5 + 4 + "6" + 1);// "961"
	}
}
