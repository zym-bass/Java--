package com.ujiuye.finaldemo;

public class FinalMethodZi extends FinalMethod {
   // �̳е��˸����е��������� : fun() ; play();
   // fun������д, play������д
	@Override
	public void fun() {
		System.out.println("����������дfun");
	}
	
	// Cannot override the final method from FinalMethod
	// �޷���дʹ��final���η���
	/*public void play() {
		System.out.println("�����е�final���շ���, ���Լ̳�, ������д");
	}*/
}
