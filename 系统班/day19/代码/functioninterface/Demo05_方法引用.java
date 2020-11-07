package com.ujiuye.functioninterface;

public class Demo05_�������� {

	public static void main(String[] args) {
         // Lambda���ʽʵ��:
		InterDemo id = x->System.out.println(x);
		id.print(5);// 5
		
		// Systemϵͳ���о�̬��Ա����out, ���÷���PrintStream(��ӡ��)����, ������.����println��������
		// ����׼�������
		// ��������ʵ��InterDemo�ӿ�
		InterDemo id1 = System.out :: println;
		id1.print(99);// 99
		
		// ��������ʵ��InterDemo2�ӿ�
		InterDemo2 id2 = x->System.out.println(Integer.parseInt(x) + 1);
		// ��������
		InterDemo2 id3 = new NumberPrint() :: print;
		id3.print("125");// 126
		
		// ��������
		InterDemo2 id4 = NumberPrint2 :: print;
		id4.print("88");// 93
	}
}

class NumberPrint{
	public void print(String x) {
		System.out.println(Integer.parseInt(x) + 1);
	}
}

class NumberPrint2{
	public static void print(String x) {
		System.out.println(Integer.parseInt(x) + 5);
	}
}

@FunctionalInterface
interface InterDemo{
	public abstract void print(int x);
}

@FunctionalInterface
interface InterDemo2{
	public abstract void print(String x);
}
