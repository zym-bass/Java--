package com.ujiuye.extendsDemo;

public class Test�̳е�ʹ��ϸ�� {
	public static void main(String[] args) {
        Son s = new Son();
        // 1. �����Ӹ���̳��г�Ա����
        System.out.println(s.i + "---" 
          + s.my + "---" + s.w);// 10, 88, 99 
        
        // 2. �����Ӹ���̳��з�������
        s.eat();// ����������д��������
        s.sleep();// ���ôӸ���̳����ķ���
        s.useI(); // ������������з���
	}
}
