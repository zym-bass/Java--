package com.yiming.java1025;
/*
    自定义泛型可以吗？可以

*/
public class GenericTest03<E> {


    public void doSome(E o){
        System.out.println(o);
    }
    public static void  main(String[] args){
        GenericTest03<String> gt = new GenericTest03<>();

        //类型不匹配
        //gt.doSome(100);
        gt.doSome("100");


    }
}
