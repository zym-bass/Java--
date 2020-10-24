package com.yiming.java1023;

import java.text.DecimalFormat;

/*
    关于数字格式化
        格式：
           # 表示任意数字
           , 表示千分位
           . 表示小数点
           0 不够不零

*/
public class DecimalFormatTest01 {
    public static void main(String[] args) {
        DecimalFormat a = new DecimalFormat("###,###.0000");
        String s1 = a.format(267574.242);
        System.out.println(s1);

    }

}
