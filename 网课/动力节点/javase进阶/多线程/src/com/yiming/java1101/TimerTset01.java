package com.yiming.java1101;

/*
    使用定时器指定定时任务
*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTset01 {
    public static void main(String[] args) throws ParseException {
        //创建定时器对象
        Timer timer = new Timer();
        //Timer timer = new Timer(true);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = sdf.parse("2020-11-01 21:32:00");
        timer.schedule(new logTimeTask(),date,10000);
    }
}

class logTimeTask extends TimerTask{

    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String strTime = sdf.format(new Date());
        System.out.println(strTime+"执行了数据备份");
    }
}