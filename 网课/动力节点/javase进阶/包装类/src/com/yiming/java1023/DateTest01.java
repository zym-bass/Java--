package com.yiming.java1023;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateTest01 {
    public static void main(String[] args)  throws Exception {
        //创建时间对象
        Date a = new Date();
        System.out.println(a.toString());//Sat Oct 24 07:22:51 CST 2020

        //日期可以格式化吗？
        //将日期类型Date,按照指定的格式进行转换:Date->转换成具有一定格式的日期字符串->String
        //SimpleDateFormat是java.text包下的，专门负责日期格式化的
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss-SSS");
        /*
            yyyy年
            MM月
            dd日
            HH时
            mm分
            ss秒
            SSS毫秒
        */
        //将日期转换成字符串
        String nowTinesSte = sdf.format(a);
        System.out.println(nowTinesSte);

        //将字符串转换成日期
        String time = "2020-10-24-08-20-47-345";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss-SSS");
        Date dateTime = sdf2.parse(time);
        System.out.println(dateTime);



    }
}
