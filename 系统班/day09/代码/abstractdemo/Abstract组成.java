package com.ujiuye.abstractdemo;

public abstract class Abstract��� {
	// 1. ���Զ������Ա����
    int i = 10;
    static final int I = 20;
    private String name = "����";
    
    // 2. ���Զ�����ǳ��󷽷�
    public void fun() {
    	System.out.println("-------");
    }
    
    public static void fun2() {
    	System.out.println("++++++++++++");
    }
    
    // 3. ���󷽷�
    public abstract int getSum(int x, int y);
    
    // 4. ���Զ�������췽��
    public Abstract���() {
    	System.out.println("���ǳ�����Ŀղ�������");
    }
}
