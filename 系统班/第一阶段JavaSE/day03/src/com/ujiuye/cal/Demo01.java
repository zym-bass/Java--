package com.ujiuye.cal;

public class Demo01 {


	public static void main(String[] args) {
	// 1. ++����--������ĳ������֮��, �����������һ���������, ������������������
	int a = 10;
	a++;
	System.out.println(a);// 11
	++a;
	System.out.println(a);// 12

	int b = 5;
	b--;
	System.out.println(b);// 4
	--b;
	System.out.println(b);// 3

	// 2. ++�����ڱ���֮ǰ, �ұ�����������, �Ƚ��б�����������, Ȼ�����������������
	// ������� : 1) ++a a = 13 2) a + b = 13 + 3 = 16
	int w = ++a + b;
	System.out.println(w);// 16
	System.out.println(a);// 13

	// --�����ڱ���֮��, �ұ�����������, ��ʹ�ñ���aԭֵ��������, �ٽ���aֵ--����
	// ������� : 1) 13 + 3 = 16(��ֵ��y) 2) a-- a = 12
	int y = a-- + b;
	System.out.println(y);// 16
	System.out.println(a);// 12

	System.out.println("---------------");

	// a = 12 b = 3
	// 1) 12 + 3 = 15(��ֵresult) 2) a++ a = 13
	int result = a++ + b;// a++ + b;
	System.out.println(result);// 15
	System.out.println(a);// 13
	System.out.println(b);// 3
	}

}
