package com.ujiuye.interfacedemo;

public class TestInterface {

	public static void main(String[] args) {
		// Cannot instantiate the type MyInterface
		// 1. �ӿڲ���ʵ����
		// MyInterface my = new MyInterface();
		
		// 2. ��д�˽ӿ������г��󷽷�ʵ����, ��������ʹ��
		MyInterfaceImpl2 my2 = new MyInterfaceImpl2();
		my2.eat();
		System.out.println(my2.equal(3.14, 3.5));
		
		// 3. �ӿ���ֻ�ܶ������Ա����
		System.out.println(�ӿ����.I);// �ӿ���.ֱ�ӵ���i, ֤��i��static����
		// The final field �ӿ����.i cannot be assigned
		// �ӿ����.i = 99;  final��
		
		// �ӿ����.J = 999;
	}
}
