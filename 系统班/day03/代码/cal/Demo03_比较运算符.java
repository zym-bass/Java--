package com.ujiuye.cal;

public class Demo03_�Ƚ������ {

	public static void main(String[] args) {
        int i = 10;
        int j = 20;
        boolean boo = i == j;
        System.out.println(boo);// false
        
        boolean boo1 = i != j;
        System.out.println(boo1);// true
        
        System.out.println(i >= j);// false
        
        // �����һ����������i , �ж�i�ǲ���5��10֮�������(���� : ��֤iֵ���ڵ���5ͬʱС�ڵ���10���ݷ�Χ����)
        //The operator <= is undefined for the argument type(s) boolean, int
        // ����� <= û�ж���� boolean������int����֮��ȽϷ�ʽ
        // 1) 5 <= i  true
        // 2) true <= 10
        // boolean boo2 = 5 <= i <= 10;
	}

}
