package com.ujiuye.block;

public class qwe {

	public static void main(String[] args) {
		Person p = getInstance();// ��������
		p.eat();
	}

	static Person getInstance() {
		// ��β�ȫ��������main�������� ���Է���
		return new Person();

	}

	static class Person {// ��̬��Ա�ڲ���
		public void eat() {
			System.out.println("�Է�");
		}
	}
}
