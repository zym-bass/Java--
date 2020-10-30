package com.ujiuye.map;

import java.util.HashMap;
import java.util.Map;

public class Demo01_Map�з��� {

	public static void main(String[] args) {
          Map<Integer, String> map = new HashMap<>();
          //1.�����ӵ�keyֵ��Map�����в�����, put������ʾ����; ��Ӽ�ֵ�����ݵ�Map������
          map.put(2, "b");
          map.put(1, "a");
          map.put(3, "c");
          
          System.out.println(map);//{1=a, 2=b, 3=c}
          
          //2.�����ӵ�keyֵ��Map�����д���, put������ʾ�޸�, ��ʾ�޸�valueֵ
          map.put(2, "hello");
          System.out.println(map);//{1=a, 2=hello, 3=c}
          
         
         //3.containsKey(Object key) : ��֤Map���ϼ����Ƿ����ָ������key��ֵ, ��������true.����false
	     System.out.println(map.containsKey(3)); // true
	     
	     //4.containsValue(Object value): ��֤Map����ֵ���Ƿ����ָ������value��ֵ��������true.����false
	     System.out.println(map.containsValue("b"));// false
	     
	     //5.get(Object key) : ͨ��Map������Ψһ��keyֵ,��ȡ�����Ӧ��valueֵ
	     System.out.println(map.get(2));// hello
	     
	     //6.remove(Object key) : ͨ��Map������Ψһ��keyֵ, ��λ����ֵ��, ɾ����ֵ��, ���ر�ɾ����valueֵ
	     String value =  map.remove(3);
	     System.out.println(value);// c
	     System.out.println(map);// {1=a, 2=hello}
	     
	     //7.size() : ��ȡ��Map�����еļ�ֵ������, ����int���ͽ��
	     System.out.println(map.size() + "----");// 2
	     
	     //8.clear() : ���Map���������м�ֵ��Ԫ��
	     map.clear();
         System.out.println(map);//{}
         
         //9.isEmpty() : ��֤Map�������Ƿ��м�ֵ��Ԫ��, ���û�з���true; �з���false
         System.out.println(map.isEmpty());// true
         System.out.println(map.size());// 0
	}
}
