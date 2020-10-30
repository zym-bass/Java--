package com.ujiuye.fanxing;

public class TestFanXing {

	public static void main(String[] args) {
		// 1. 类上泛型 : f对象中所有使用到泛型的部分全部同步成String类型
		FanXingClass<String> f = new FanXingClass<>();
		f.addEle("abc");
		
		// 2. 方法上泛型
		String[] arr = {"a","b","c","d"};
		FanXingMethod.changeArrayEle(arr, 1, 2);//[a, c, b, d]
	}
}
