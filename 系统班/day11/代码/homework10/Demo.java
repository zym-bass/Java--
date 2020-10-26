package com.ujiuye.homework10;

class BaseTmp {
	 BaseTmp(){
		System.out.println("BaseTmp");// 3.BaseTmp  // 5. BaseTmp
	}
}

class Base{
	BaseTmp tmp = new BaseTmp();
	static {
		System.out.println("Base��̬");// 1. Base��̬
	}
	
	Base(){       
		System.out.println("Base");// 4.Base 
	}
}

class BaseChild extends Base{
	BaseTmp tmp = new BaseTmp();// 5.
	static {
		System.out.println("BaseChild��̬");// 2.BaseChild��̬
	}
	BaseChild(){
		super();
		System.out.println("BaseChild");// 6. BaseChild
	}
}

class Demo{
	public static void main(String[] args) {
		// 1. ��Ϊʹ��BaseChild, ���BaseChild��Ӧ�ĸ���Base.class�ֽ����ļ��Ƚ��뵽������, �������о�̬��Ա
		// 2.BaseChild.class�ֽ����ļ����뵽��������, �������о�̬��Ա
		// 3.��Ϊ����һ������BaseChild����, ����������������뵽���ڴ���, JVM�����������зǾ�̬��Ա����
		// ���ؽ��뵽�������ڶ��ڴ���
		// 4.���ø��๹�췽��, �������Ա�������и�ֵ
		// 5. �����Ա������Ҫ���ؽ��뵽���ڴ���
		// 6. �������๹�췽���������Ա�������и�ֵ
		 new BaseChild();
	}
}

