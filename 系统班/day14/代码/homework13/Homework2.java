package com.ujiuye.homework13;

import java.util.ArrayList;
import java.util.ListIterator;

public class Homework2 {
	/*����	����	�Ա�	��ַ
	����	23	��	����
	����	45	��	����
	����	34	Ů	ɽ��
	����	22	��	�Ϻ�
	����	33	Ů	����*/
	public static void main(String[] args) {
        ArrayList list = new ArrayList();
        Person p1 = new Person("����", 23, "��", "����");
        list.add(p1);
        list.add(new Person("����", 45, "��", "����"));
        list.add(new Person("����", 34, "Ů", "ɽ��"));
        list.add(new Person("����", 22, "��", "�Ϻ�"));
        list.add(new Person("����", 33, "Ů", "����"));
        
        ListIterator it = list.listIterator();
        while(it.hasNext()) {
        	 Object obj = it.next();
        	 Person p = (Person)obj;
        	 System.out.println(p.getName() + "--" + p.getAge() + "--" + p.getSex() + "--" + p.getAddress());
        
        	 // �����ĺ�������˵���Ϣ
        	 String name = p.getName();
        	 if("����".equals(name)) {
        		 it.add(new Person("zhao6",24,"Ů","����"));
        	 }
        	 
        	 if("����".equals(name)) {
        		 it.remove();
        	 }
        }
        
        System.out.println(list);
	}
}
