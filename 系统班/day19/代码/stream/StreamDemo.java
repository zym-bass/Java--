package com.ujiuye.stream;

import java.util.ArrayList;

public class StreamDemo {
	// ���� : �����һ������ArrayList<String>, 
	// �д洢�Ķ���һЩ���������, ɸѡ���������ŵ�, ��������3���ֵ���������
	public static void main(String[] args) {
         ArrayList<String> listName = new ArrayList<>();
         listName.add("������");
         listName.add("���޼�");
         listName.add("����");
         listName.add("������");
         listName.add("����");
         listName.add("�ųɹ�");
         
         // 1. ͨ��stream������ȡ�����Բ����������ݵ�Stream����Դ
         // predicate : Ψһ���󷽷� boolean test(T)
         listName.stream().filter(x->x.startsWith("��") && x.length() == 3)
             .forEach(System.out :: println);
         
         // 2. ���ŵ�,���ֳ���Ϊ3�������м���
         long number = listName.stream().filter(x->x.startsWith("��") && x.length() == 3).count();
         System.out.println(number);// 3
         
         // 3. �ų�ǰ��������֮��, ʣ�µ����ŵ�,���ֳ���Ϊ3������
         listName.stream().skip(2).filter(x->x.startsWith("��") && x.length() == 3)
           .forEach(System.out :: println);
         
         
         System.out.println("-------");
         
         // 4. ǰ3��Ԫ����,���ŵ�,���ֳ���Ϊ3������
         listName.stream().limit(3).filter(x->x.startsWith("��") && x.length() == 3)
          .forEach(System.out :: println);
	}
}
