package com.yiming.java1023;

import java.text.SimpleDateFormat;
import java.util.Date;
public class DateTest03 {
    public static void main(String[] args) {
        Date a = new Date(0);
        System.out.println(a);

        SimpleDateFormat a1 = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss-SSS");
        Date s = new Date(System.currentTimeMillis() - 1000*60*24*60);
        String s1 = a1.format(s);
        System.out.println(s1);


    }
}
