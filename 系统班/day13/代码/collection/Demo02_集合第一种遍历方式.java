package com.ujiuye.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo02_���ϵ�һ�ֱ�����ʽ {
    public static void main(String[] args) {
		// 1. ������һ����������
    	Collection c = new ArrayList();
    	// �����������������Զ���װ�����, �û�������ֱ�ӷ�װ�ɶ�Ӧ�������ʹ洢�ڼ�����
    	c.add(15);
    	c.add(-8);
    	c.add(99);
    	
    	// 2. ʹ��toArray����, ������ת����һ��Object[]����
    	Object[] objArr = c.toArray();
    	
    	for(int index = 0; index < objArr.length; index++) {
    		//Type mismatch: cannot convert from Object to Integer
    		Integer obj = (Integer)objArr[index];
    		System.out.println(obj);
    	}
	}
}
