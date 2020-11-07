package com.ujiuye.interfaceJDK8;

public class InterfaceJDK8Impl extends Fu implements MyInter,MyMyInter2{
	@Override
	public void eat() {
		System.out.println("MyInter�ӿڵ�ʵ������д���󷽷�eat");
	}
	
	// ʵ�����п�����д���ӿ��е�Ĭ�Ϸ���
	// 1) ���в���дdefault Ĭ�����ε�, ��д�ű�ʾĬ������
	// 2) ʵ������дĬ�Ϸ���ʱ, ���η���Ҫ��public����
	@Override
	public void sleep() {
		System.out.println("��д�ĸ��ӿ��е�Ĭ�Ϸ���sleep");
	}

	@Override
	public void fun() {
		// ���ʵ������д��ͻ��������ʱ, �������������ĳһ�����ӿ���Ĭ�Ϸ���ʵ�ֹ��� : 
		// �﷨  ���ӿ���.super.������(ʵ�ʲ���);
		MyInter.super.fun();
		MyMyInter2.super.fun();
		System.out.println("���ӿ���fun��ͻ, ʵ����ֻ����д, �������ᱨ��");
	}
}

interface MyInter{
	public abstract void eat();
	
	default void fun() {
		System.out.println("���ӿ�MyInter��Ĭ�Ϸ���fun");
	}
	
	// �ڽӿ��ж����һ��ʹ��default���ε�Ĭ�Ϸ���
	default void sleep() {
		System.out.println("���ӿ�MyInter��Ĭ�Ϸ���sleep");
	}
}

interface MyMyInter2{
	// MyMyInter2�ӿڵ�Ĭ�Ϸ���fun��ӿ�MyInter��Ĭ�Ϸ���һ��
	default void fun() {
		System.out.println("���ӿ�MyInter2�г�ͻ��Ĭ�Ϸ���fun");
	}
}
