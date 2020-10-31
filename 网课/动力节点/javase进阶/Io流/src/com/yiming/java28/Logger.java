package com.yiming.java28;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public  class Logger {
    public static void log (String msg){
        try{
            //指向一个日志文件
            PrintStream out = new PrintStream(new FileOutputStream("xxxx",true));
            //改变输出方向
            System.setOut(out);
            //日期当前时间
            Date nowTime = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS ");
            String strTime = sdf.format(nowTime);

            System.out.println(strTime+":"+msg);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
