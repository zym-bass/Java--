package com.ujiuye.function;

public class Demo01_���������ʹ�� {
	      /*  // ���÷���(ʹ�÷���): ��Ҫ����ʵ�ʲ���ֵ
			// 1. ֱ�ӵ���, print����û�з���ֵ����
			print(6);
			// 2. �������
			System.out.println(getSum(3,5));// 8
			// 3. ��ֵ����
			boolean boo = equal(3.14,3.14);
			System.out.println(boo);// true
*/	public static void main(String[] args) {
	     int re = getSum(3,5);
	     System.out.println(re);
	}
	/*���η� ����ֵ���� ������(�����б�){
	               ������;
	       return ���;
	}*/
	// ����1 : �����һ����������, ���κ����������ĺ�
	//This method must return a result of type int
	public static int getSum(int x, int y) {
		int w = x + y;
		return w;
	}
	
	// ����2 : �����һ����������, �Ƚ������������������Ƿ����
	public static boolean equal(double x, double y) {
		boolean boo = x == y;
		return boo;
	}
	
	// ����3 : �����һ����������, ��ӡ1-n����(1-n����������ӡ, nΪ������)
	public static void print(int n) {
		for(int i = 1; i <= n; i++) {
			System.out.println(i);
		}
		// return;
	}	
}
