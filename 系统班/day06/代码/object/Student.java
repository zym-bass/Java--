package com.ujiuye.object;

public class Student {
	// ����
	String name;
	// �༶��
	String classNo;
	// ѧ��
	String id;
	// ����, ��Ϊʹ��private����, ageֻ����Student����ʹ��, �����������಻��ֱ��ʹ�úͷ���
	private int age;
	
	// Setter���� : ��age˽�г�Ա�����ṩ�����, �����ķ���age��ʽ, ��age���и�ֵ
	public void setAge(int a) {
		if(a > 0) {
			age = a;
		}else {
		  System.out.println("�ṩ������" + a 
			+ "��������������, Ĭ������ֵΪ0");
		}
	}
	// Getter���� : ��˽�г�Ա����age�ṩ���⹫���Ļ�ȡ��ʽ
	public int getAge() {
		return age;
	}
	
	public void study() {
		System.out.println("ѧ��һֱ��Ŭ����ѧϰ");
	}
}
