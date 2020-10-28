package com.ujiuye.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo01_Collection�г��÷��� {

	public static void main(String[] args) {
         Collection c = new ArrayList();
         // 1)add(Object obj) : �򼯺����������obj, ĩβ׷��
         c.add("abc");
         c.add("123");
         c.add("hello");
         
         System.out.println(c);//[abc, 123, hello]
         
         // 2)remove(Object obj) : ������obj�Ӽ�����ɾ��
         c.remove("123");
         System.out.println(c);//[abc, hello]
         
         // 5)size(): ��ȡ�������е�Ԫ�ظ���, ����ֵ����int
         System.out.println(c.size());// 2
         
         // 6)inEmpty():��֤�����е��Ƿ�Ϊ��, �������Ϊ��, ��ô����true; ������ϲ�Ϊ�շ���false
         System.out.println(c.isEmpty());// false
         
         // 3)clear() : ��ռ���, ɾ�������е�����Ԫ��, ����ֵ����void
         c.clear();
         System.out.println(c);//[]
         
         // 4)contains(Object obj) :  ��֤�������Ƿ����Ԫ��obj, ��������true, ����������false
         System.out.println(c.contains("abc"));//false
         
         // 5)size(): ��ȡ�������е�Ԫ�ظ���, ����ֵ����int
         System.out.println(c.size());
         
         // 6)inEmpty():��֤�����е��Ƿ�Ϊ��, �������Ϊ��, ��ô����true; ������ϲ�Ϊ�շ���false
         System.out.println(c.isEmpty());// true

	}

}
