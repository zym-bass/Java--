package com.yiming.java1022;

/*    在实际开发中，进行字符串的拼接的问题：
        因为java中的字符串是不可改变的，每一次拼接都会产生的字符串
        这样会占大量的内存

       如何优化StringBuffer
       在创建StringBuffer的时候尽可能给定一个初始化容量，
       根据需求预估大一点容量，


*/
public class StringBufferTest01 {
    public static void main(String[] args) {
        //创建一个初始化容量为16的byte[]数组。（字符串缓存区对象）
        StringBuffer s = new StringBuffer();

        //拼接字符串，以后拼接字符串统一调用append()方法。
        s.append("a");
        s.append("a");
        s.append("a");
        s.append("a");
        s.append("a");
        s.append("a");//数组满了会自动扩容
        System.out.println(s);

        StringBuffer s1 = new StringBuffer(100);
        s1.append("wefwfwefwfwfwf");
        s1.append("wefwfwefwfwfwf");
        s1.append("wefwfwefwfwfwf");
        s1.append("wefwfwefwfwfwf");
        System.out.println(s1);

    }
}
