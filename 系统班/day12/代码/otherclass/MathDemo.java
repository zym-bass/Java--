package com.ujiuye.otherclass;

public class MathDemo {

	public static void main(String[] args) {
        // 1. Math���о�̬��Ա����
		System.out.println(Math.E);
		System.out.println(Math.PI);
		
		// 1)abs(int i) : ���ط���, ��ȡ������i�ľ���ֵ(����ֵ��������)
		System.out.println(Math.abs(-3));// 3
		
		// 2)ceil(double d) : ��������������ȡ��, ����ֵ����double
		System.out.println(Math.ceil(3.01));// 4.0
		
		// 3)floor(double d) : ��������������ȡ��, ����ֵ����double
		System.out.println(Math.floor(3.99));// 3.0
		
		// 4)max(double d, double d1) : ��ȡ�������еĽϴ�ֵ
		// 5)min(double d, double d1) : ��ȡ�������еĽ�Сֵ
		System.out.println(Math.max(3.14, 3.14));// 3.14
		System.out.println(Math.min(2.13, -9.0));// -9.0
		
		// 6)random() : ����[0.0, 1.0)֮������С��
		System.out.println(Math.random());
		
		/*7)round(double d) : �����ṩ�Ĳ����ĵ�һ��С��λ��, ��������������ȡ������������ȡ��
                 (��һλС����ֵ >= 5, ����ȡ��; ��������ȡ��), ����һ��long���ͽ��*/
		System.out.println(Math.round(6.77)); // 7
		System.out.println(Math.round(7.51)); // 8
		System.out.println(Math.round(9.49)); // 9
	}
}
