package com.ujiuye.thread;

public class WeekdayClass {
    // 思考: 只能创建出7个WeekdayClass对象
	// 1) 不能让其他类可以随意new对象, 构造方法私有化
	private WeekdayClass() {}
	
	// 2)在本类中创建出7个对象
	public static final WeekdayClass MON = new WeekdayClass();
	public static final WeekdayClass TES = new WeekdayClass();
	public static final WeekdayClass WEN = new WeekdayClass();
	
}
