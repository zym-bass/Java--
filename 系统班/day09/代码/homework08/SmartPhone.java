package com.ujiuye.homework08;

public class SmartPhone extends Phone {
	@Override
	public void call() {
		super.call();
		System.out.println("智能手机可以视频通话");
	}
}
