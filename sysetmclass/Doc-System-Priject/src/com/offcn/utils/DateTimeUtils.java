package com.offcn.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class DateTimeUtils {
	public static String times() {
		Date time = new Date();
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return s.format(time);
	}
}
