package com.ujiuye.innerclass;

public class Demo02_�����ڲ���ʹ�� {
    public static void main(String[] args) {
    	// MyInter�ӿڵ�ʵ�������(�����ڲ������)
    	new MyInter() {
			@Override
			public void fun() {
				System.out.println("�����ڲ���ʵ��fun");
			}

			@Override
			public int getSum(int x, int y) {
				return x + y;
			}
		}.fun();
		
		// �����ڲ����Ż� : ���ýӿڵĶ�̬��
		// ���ӿ����� ָ�� �ӿ�ʵ�������
		// my���������õľ��ǵȺ��ұ�ʵ��������д����
		MyInter my = new MyInter() {
			@Override
			public void fun() {
				System.out.println("�����ڲ���ʵ��fun");
			}

			@Override
			public int getSum(int x, int y) {
				return x + y;
			}
		};
		
		my.fun();
		System.out.println(my.getSum(3, 5));
	}
}

interface MyInter {
	public abstract void fun();
	public abstract int getSum(int x, int y);
}

class MyInterImpl implements MyInter{

	@Override
	public void fun() {
		System.out.println(123);
	}

	@Override
	public int getSum(int x, int y) {
		
		return 0;
	}
	
}

