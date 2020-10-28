package com.ujiuye.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo03_Collection��All���� {
   public static void main(String[] args) {
	    Collection c = new ArrayList();
	    c.add("a");
	    c.add("b");
	    
	    Collection c1 = new ArrayList();
	    c1.add("1");
	    c1.add("2");
	    
	    // 1.addAll(Collection c): ����������c�е�����Ԫ��, ����ӵ��������ü�����
	    c.addAll(c1);
	    System.out.println(c);//[a, b, 1, 2]
	    
	    // 2.removeAll(Collection c) : ����������c�е�����Ԫ�ض��ӷ������ü�����ɾ��
	    c.removeAll(c1);
	    System.out.println(c);//[a, b]
	    
	    // 3.containsAll(Collection c): ��֤�������ü�����, �Ƿ���ȫ��������c�е�����Ԫ��,
	    // �����ȫ��������true; ���򷵻�false
	    Collection c2 = new ArrayList();
	    c2.add("b");
	    System.out.println(c.containsAll(c2));// true
	    System.out.println(c.containsAll(c1));// false
	    
	    // 4. retainAll(Collection c) : ���������ü������������c�н�������, �������������ü�����
	    // c--->[a,b]
	    // c2--->[b]
	    /*c.retainAll(c2);
	      System.out.println(c);//[b]
        */   
	    
	    // c--->[a,b]
	    // c1-->[1,2]
	    c.retainAll(c1);
        System.out.println(c);//[]
   }
}
