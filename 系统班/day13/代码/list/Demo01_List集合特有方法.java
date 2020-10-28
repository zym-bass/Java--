package com.ujiuye.list;

import java.util.ArrayList;
import java.util.List;

public class Demo01_List�������з��� {

	public static void main(String[] args) {
        List list = new ArrayList();// list�����е�������Χ0-3
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        
        // 1.add(int index, Object obj) : ��Ԫ��obj��ӵ�����ָ��index����λ����
        list.add(2,"first");
        System.out.println(list);// [a, b, first, c, d]
        
        // 2.remove(int index) : ɾ��index����λ���ϵ�Ԫ��, ��ɾ��Ԫ�ص�ԭֵ����
        Object obj = list.remove(4);
        System.out.println(obj);// d
        System.out.println(list);// [a, b, first, c]
       
        // 3.set(int index, Object obj) : ��������ָ����index����λ���ϵ�Ԫ���滻��obj, �����滻��Ԫ��ԭֵ��Ϊ����ֵ���� 
        Object obj1 = list.set(2, "modify");
        System.out.println(obj1);// first
        System.out.println(list);// [a, b, modify, c]
        
        // 4. get(int index) : ��ȡ��������ָ��index����λ���ϵ�Ԫ��, ����ֵ����Object
        System.out.println(list.get(1));// b
        System.out.println(list.get(3));// c
	}
}
