package com.ujiuye.block;

public class Demo03_��̬����� {
	int i;
	static String schoolName;
	// �������̬�����
    static {
    	schoolName = "��һ��ѧ";
    	// i = 88;
    	System.out.println("��̬�����ִ����");// 1.��̬�����ִ����
    }
    // ��������
    {
    	i = 10;
    	System.out.println("���ǹ�������" + i);// 3. ���ǹ�������10  // 5
    }
    
    public Demo03_��̬�����() {
    	System.out.println("���ǹ��췽��");// 4. ���ǹ��췽��  // 6
    }
    
    public static void main(String[] args) {
    	System.out.println(Demo03_��̬�����.schoolName);// 2. ��һ��ѧ
    	Demo03_��̬����� demo = new Demo03_��̬�����();
    	Demo03_��̬����� demo1 = new Demo03_��̬�����();
	}
}
