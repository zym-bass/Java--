package com.ujiuye.fanxing;

public class TestFanXing {

	public static void main(String[] args) {
		// 1. ���Ϸ��� : f����������ʹ�õ����͵Ĳ���ȫ��ͬ����String����
		FanXingClass<String> f = new FanXingClass<>();
		f.addEle("abc");
		
		// 2. �����Ϸ���
		String[] arr = {"a","b","c","d"};
		FanXingMethod.changeArrayEle(arr, 1, 2);//[a, c, b, d]
	}
}
