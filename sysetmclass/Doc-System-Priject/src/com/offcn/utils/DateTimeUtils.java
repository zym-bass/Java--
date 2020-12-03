package com.offcn.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class DateTimeUtils {
	public static String times() {
		Date time = new Date();
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return s.format(time);
	}
	public static Date datetimes(String times) {
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return s.parse(times);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
