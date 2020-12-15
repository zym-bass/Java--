package com.yiming.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimsUtils {
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public String dateFromatString (Date date){
        return sdf.format(date);
    }

}
