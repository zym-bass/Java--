package com.ujiuye.abstractdemo;

public class Abstract���Zi extends Abstract��� {

	@Override
	public int getSum(int x, int y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		Abstract���Zi az = new Abstract���Zi();
		System.out.println(az.getSum(3, 5));
		System.out.println(az.i);
		az.fun();
		
		// ���� : ������Ҳ����ʹ�ö�̬
		Abstract��� a = new Abstract���Zi();
		System.out.println(a.getSum(5, 6));// 11
	}

}
