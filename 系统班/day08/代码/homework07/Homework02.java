package com.ujiuye.homework07;

public class Homework02 {
	public static void main(String[] args) {
		/*
		 *   1. ����һ��Foo���Ͷ���, Foo����.class�ֽ����ļ����뵽��������, ��̬��Ա���ؽ��ڴ���,
		 *    ��̬��Ա������ֵ
		 *   2. ���ÿղ������췽��, ʹ��i��ԭֵ��id�ȸ�ֵ, ��ֵ����, i++
		 */
		Foo f1 = new Foo();// id = 0; i = 1;
		Foo f2 = new Foo();// id = 1; i = 2;
		Foo f3 = new Foo();// id = 2; i = 3;
		                   //  0            1                2               3
		System.out.println(f1.id + "---" + f2.id + "---" + f3.id + "----" + Foo.i);
	}
}


class Foo{
	int id;
	static int i = 0;
	public Foo() {
		id = i++;
    }
}
