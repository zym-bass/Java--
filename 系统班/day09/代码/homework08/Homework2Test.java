package com.ujiuye.homework08;

public class Homework2Test {
	 /* ѧ��������Ϣ :  ���� : С��   ��� : 1001  �༶�� :  12   �ɼ�: 88
	   ��ʦ������Ϣ : ���� : ���  ���: 449   ְ�� : ����   ���� : ������*/
	public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setName("���");
        t.setId("449");
        t.setCall("����");
        t.setDepartment("������");
        
        t.messagePrint();
        
        Student s = new Student("С��","1001","12",88);
        s.messagePrint();
	}
}
