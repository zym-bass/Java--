package com.ujiuye.extendsDemo;

public class TestFuAndZi {

	public static void main(String[] args) {
       Zi z = new Zi();
       System.out.println(z.i);// 10
       // The field Fu.j is not visible
       // 1. �����в��ܼ̳�ʹ�ø����е�˽�г�Ա����
       // System.out.println(z.j);
       
       z.fun();// ���Ǹ�����fun����
       // The method sleep() from the type Fu is not visible
       // 2. �����в��ܼ̳�ʹ�ø����е�˽�з���
       // z.sleep();
	}
}
