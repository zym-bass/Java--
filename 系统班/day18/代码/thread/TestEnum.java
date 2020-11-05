package com.ujiuye.thread;

public class TestEnum {

	public static void main(String[] args) {
		WeekdayClass mon = WeekdayClass.MON;
		WeekdayClass mon1 = WeekdayClass.MON;
		System.out.println(mon == mon1);
		
		// ≤‚ ‘√∂æŸ¿‡–Õ
		Weekday monEnum = Weekday.MON;
		Weekday monEnum1 = Weekday.MON;
		System.out.println(monEnum == monEnum1);// true
		
	}
}
