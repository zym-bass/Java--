package com.ujiuye.java1022;

/*  String int Integer 之间互相转换
*
*   String -> int    int a = Integer.parseInt(String s);
*   int ->  String   String a = String.valueOf(int s);
*
*   String -> Integer   Integer a = Integer.valueOf(String s);
*   Integer -> String   String  a = String.valueOf(Integer s);
*
*   int -> Integer    Integer a = Integer.valueOf(int a);
*   Integer -> int    int a = new Integer().intValue();
*
* */

public class IntegerTest05 {
    public static void main(String[] args){
        Integer a = 12342;
        int s = a.intValue();
        int m = new Integer(2342).intValue();

        a = Integer.valueOf(s);

        String s1 = "131";
        int m1 = Integer.parseInt(s1);
        s1 = String.valueOf(m1);

        a = Integer.valueOf(s1);
        s1 = String.valueOf(a);

    }
}
