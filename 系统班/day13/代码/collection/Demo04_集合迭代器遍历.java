package com.ujiuye.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo04_���ϵ��������� {

	public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("ab");
        c.add("123");
        c.add("hello");
        
        // 1. ��ȡ������c����������
        Iterator it = c.iterator();
        // 2. hasNext : �жϼ������Ƿ񻹾�����һ��Ԫ������, ����з���true, ���û�з���false
        while(it.hasNext()) {
        	// 3. next() : ��ȡ�������е���һ��Ԫ��, ���ػ�ȡ��Ԫ�ؽ��, Object����
        	Object obj = it.next();
        	String s = (String)obj;
        	System.out.println(s);
        }
        // NoSuchElementException
        System.out.println(it.next());
	}
}
