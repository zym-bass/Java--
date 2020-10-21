package com.yiming.java1021;
/*
    关于Object类中的finalize()方法
    1.
*/
public class FinalizeTest {
    public static void main(String[] args){

        for (int i = 0; i < 5500; i++) {
            Person p = new Person();
            p = null;
            System.gc();
        }

    }
}
class Person {
    public void finalize() throws Throwable {
        System.out.println("即将被清理掉");
    }
}
