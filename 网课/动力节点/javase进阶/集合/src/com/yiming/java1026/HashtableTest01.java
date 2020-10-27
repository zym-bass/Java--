package com.yiming.java1026;

/*
    HashtableTest的key可以为null吗？
        不能
    HashMap集合的key和value都是可以为null的

    Hashtable方法都有带synchronized：线程安全的
    但是线程安全还有其他方案，Hashtable对线程的处理
    导致效率较低，使用较少了

    Hashtable 扩容因子0.75 扩容是*2+1
*/

import java.util.Hashtable;
import java.util.Map;

public class HashtableTest01 {
    public static void main(String[] args) {
        Map hashtable = new Hashtable();
        hashtable.put(null,"124");//报错
        hashtable.put(123,null);//报错
    }
}
