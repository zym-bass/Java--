package com.ujiuye.object;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. ����ͨ������¼�������������
        /*System.out.println("������һ���ֽ�����, ��Χ-128---127");
        byte b = sc.nextByte();
        System.out.println(b);
        
        System.out.println("������һ��double��������:");
        double d = sc.nextDouble();
        System.out.println(d + "----");*/
        
        // 2. ����ͨ������¼����ַ���
        System.out.println("�������ַ���:");
        // 1)next�������ܿ���ͨ���ո���ж������֮������(�س�����Ҳ������Ϊһ�����뷽��������־)
        String first = sc.next();
        String second = sc.next();
        //System.out.println(first + "---" + second);
        
        // admin 123
        System.out.println("������һ���û���:");
        /*nextLine()���������ȡ���˻س�����, ��ô��Ϊ��������������; �����nextLine()����֮ǰ,
        ����next����next������������, ���������Ļس�����, �ͻᱻnextLine���ղ�����Ϊ���ݽ��
        ע��Ľ������ : 1) �����һ��nextLine����, ��������ǰ�淽������Ļس�����
        2)������һ���µ�Scanner���Ͷ���*/
        //String name1 = sc.nextLine();
        Scanner sc1 = new Scanner(System.in);
        // 2) nextLine() ��������ֻ��ͨ���س����н��ж������֮����з�
        String name = sc1.nextLine();
        System.out.println("������һ������:");
        String password = sc1.nextLine();
        System.out.println(name + "---" + password);
	}
}
