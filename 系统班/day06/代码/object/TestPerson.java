package com.ujiuye.object;

public class TestPerson {

	public static void main(String[] args) {
        // 1. ������һ������(Person)����
		// ����    ������ = new ����();
		Person p = new Person();
		// 2. ��p���������г�Ա������ֵ
		p.name = "����";
		p.age = 20;
		p.sex = "��";
		
		// 3. ��ȡ����p�еĳ�Ա����������
		String name = p.name;
		System.out.println(name); 
		
		System.out.println(p.age);
		System.out.println(p.sex);
		
		// 4. ����person�����з�������
		p.eat();
		p.sleep();
		p.work();
	}
}
