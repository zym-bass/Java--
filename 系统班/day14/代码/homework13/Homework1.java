package com.ujiuye.homework13;

import java.util.ArrayList;
import java.util.Iterator;

public class Homework1 {
	/*1 .�����������󣬲��ô���ʵ�֣�
	(1)����List���ϣ��������ַ��������а�������������"def"
	(2)ɾ������������"def"�ַ���
	(3)Ȼ�����õ�������������Ԫ�ز����*/
	public static void main(String[] args) {
         ArrayList list = new ArrayList();
         list.add("abc");
         list.add("hello");
         list.add("def");
         list.add("def");
         list.add("def");
         list.add("end");
         
         // ɾ�� : remove  removeAll(Collection c)
         // list.remove("def");
         // ʵ�ַ�ʽ1 : 
         /*ArrayList list1 = new ArrayList();
         list1.add("def");
         
         // 1. ɾ�������е�����def�ַ���
         list.removeAll(list1);
         System.out.println(list);
         // 2. ʹ�õ���������list������Ԫ��
         Iterator it = list.iterator();
         while(it.hasNext()) {
        	 Object obj = it.next();
        	 System.out.println(obj);
         }*/
         
         // ʵ�ַ�ʽ2 : ����ͬʱɾ������Ԫ��
         Iterator it = list.iterator();
         while(it.hasNext()) {
        	 Object obj = it.next();
        	 String s = (String)obj;
        	 if("def".equals(s)) {
        		 it.remove();
        	 }
         }
         
         System.out.println(list);
	}
}
