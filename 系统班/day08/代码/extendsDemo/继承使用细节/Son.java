package com.ujiuye.extendsDemo;

public class Son extends Father {
	int my = 88;
	// 1. �����ж�������븸��ͬ����Ա����
	int i = 0;
	// 2. �����ж�����ڸ��಻ͬ��������
	public void useI() {
		int i = 199;
		// 2. iֵ����ʹ�ñ����ͽ�����ԭ��
		System.out.println(i);// 199
		System.out.println(this.i);// 0
		// 3. ���ø����е�ͬ����Ա����,����ʹ��super�ؼ���; i = 10
		System.out.println(new Father().i);// 10
		System.out.println(super.i);// 10
	}
	
	// 3.������д�Ӹ���Father�м̳�����������eat
	@Override
	public void eat() {
		// 4. ʹ��super.���ø����з�������
		super.eat();
		System.out.println("����Son��д���෽��eat, ���಻�Ժ��ܲ�");
	}
	
	// 5. ���๹�췽��
	public Son() {
		//super();// Ĭ�ϴ���. ���ø���ղ�������
		// ���๹�췽����һ�е��ø��๹��, ��֤������������������������ڴ���
		super(9);
	}
	
	public Son(String s) {
		this();
		System.out.println(s);
	}
}
