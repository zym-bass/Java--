package com.ujiuye.java1022;

public class IntegerTest04 {
    public static void main(String[] args){
         Integer a = 12324;
         int a1 = a.intValue();
         System.out.println(a1);

         double a2 = a.doubleValue();
         System.out.println(a2);
         float a3 = a.floatValue();
         short s4 = a.shortValue();

         // pareInt(String a);
        /*parseInt(String s, int radix)
        使用第二个参数指定的基数，将字符串参数解析为有符号的整数。*/
        int a5 = Integer.parseInt("2424");
        System.out.println(a5);

        double a6 = Double.parseDouble("2342.424");
        System.out.println(a6);

        long a7 = Long.parseLong("24234");
        System.out.println(a7);

        String s1 = "12314";
        int s = Integer.parseInt(s1);
    }
}
