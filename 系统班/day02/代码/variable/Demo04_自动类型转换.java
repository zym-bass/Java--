package com.ujiuye.variable;

public class Demo04_�Զ�����ת�� {

	public static void main(String[] args) {
		// 1. С��������ֱ��ת���ɴ���������
		byte b = 15;
		int i = b;
		
		// 2. С������������������ͽ�������, С���������Զ���������Ϊ������, �����������������Ϊ׼
		short s = 15;
		//Type mismatch: cannot convert from int to short
		//short ss = s + 1;
		
		int ss = s + 1;
		System.out.println(ss);// 16
		System.out.println(i);// 15
		
		double d = ss;
		System.out.println(d);// 16.0
		
		//byte, short, char, int��������,������߱˴�֮���������, ͳͳĬ����������Ϊint, ������������, �д���int���͵�����, ��ô�������������Ϊ������׼
        byte b1 = 88;
        short s1 = 99;
        //Type mismatch: cannot convert from int to short
        //short re = b1 + s1;
        int re = b1 + s1;
        System.out.println(re);// 187
	}

}
