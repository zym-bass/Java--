package com.ujiuye.java1022;
/*
        java中8种基本数据类型对应着8种包装类类型，
        8中包装类型属于引用类型，父类是Object


*/
public class IntegerTest01 {

    //入口
    public static void main(String[] args){
        //Object 无法接受 基本类型的数据
        //孕婴出8个包装类 8个引用数据类型
        MyInt n = new MyInt(100);
        doSome(n);
        

    }
    public static void doSome(Object obj){
        System.out.println(obj);
    }
}
