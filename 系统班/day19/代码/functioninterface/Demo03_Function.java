package com.ujiuye.functioninterface;

import java.util.function.Function;

public class Demo03_Function {

	public static void main(String[] args) {
		//�ͻ�1 : yֵΪx��2��
		Function<Integer,Integer> fun1 = x->x*2;
		System.out.println(testFunction(6,fun1));// 12
		
		//�ͻ�2 : yֵΪx + 1
		Function<Integer,Integer> fun2 = x->x+1;
		System.out.println(testFunction(-9,fun2));// -8
		
		//�ͻ�3 : yֵΪx-1
		Function<Integer,Integer> fun3 = x->x-1;
		System.out.println(testFunction(88,fun3));

	}
	/*���� : �����һ����������, ����int����x��ֵ, ���������һ��int����y��ֵ, 
	y��ȡ��ʽ���ݿͻ���Ҫ�����
	�ͻ�1 : yֵΪx��2��
	�ͻ�2 : yֵΪx + 1
	�ͻ�3 : yֵΪx-1
	...
	
	*
	*  ����:
	*    1) ��һ������ : ��Ҫ�ṩint����x int x
	*    2) �ڶ������� : ��Ҫ�ṩ ����yֵ��ʽ(����), ͨ��x�õ�y, ���Խ�Function�ӿ���Ϊ������������,
	*    ʵ�ʴ��� int apply(int x)
	*/
	
	public static int testFunction(int x, Function<Integer,Integer> fun) {
		return fun.apply(x);
	}
}
