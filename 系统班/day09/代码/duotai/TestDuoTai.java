package com.ujiuye.duotai;

public class TestDuoTai {

	public static void main(String[] args) {
		Teacher t1 = (Teacher)new Person();
		// ��̬���ʽ
		Person p = new Teacher();
		p.eat();//��ʦ���������Ƥ
		//The method teach() is undefined for the type Person
		// 1.���뿴��, ���Person������û�ж����teach����, ��˱��뻷�ڱ���
		// p.teach();
		// 3. ��̬����ת�� : Ϊ�˽���������p,�ظ�������Teacher���ͱ���, ��˿���ʹ�����������з���
		Teacher t = (Teacher)p;
		t.eat();
		t.teach();// ��ʦ���Խ���
		
		// ��̬���ʽ
		Person p1 = new Doctor();
		// 2.���п��� , ���е��ǵȺ��ұ������е���д����
		p1.eat();//ҽ���Եĺ��嵭,����
		
		Doctor d = (Doctor)p1;
		d.savePerson();// ҽ�������β�����
	}
}
