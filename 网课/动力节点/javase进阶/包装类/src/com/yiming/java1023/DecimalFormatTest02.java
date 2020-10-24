package com.yiming.java1023;
import java.math.BigDecimal;
/*
    BigDecimal

*/

public class DecimalFormatTest02 {
    public static void main(String[] args) {
        BigDecimal s1 = new BigDecimal(100);
        BigDecimal s2 = new BigDecimal(200);
        BigDecimal s3 = s1.add(s2);
        System.out.println(s3);

        BigDecimal s4 = s1.divide(s2);
        System.out.println(s4);
    }
}
