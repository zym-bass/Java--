package com.ujiuye.java1022;
/*
        java中8种基本数据类型对应着8种包装类类型，
        8中包装类型属于引用类型，父类是Object

        基本数据类型              包装类型
     --------------------------------------
          byte                  java.long.Byte          1
          short                 java.long.Short         2
          int                   java.long.Integer       4
          long                  java.long.Long          8
          float                 java.long.Float         4
          double                java.long.Double        8
          char                  java.long.Character     2
          boolean               java.long.Boolean       1
*/
public class IntegerTest01 {

    //入口
    public static void main(String[] args){
        //Object 无法接受 基本类型的数据
        //孕婴出8个包装类 8个引用数据类型
        MyInt n = new MyInt(100);
        doSome(n);
        Integer a = new Integer(100);
        doSome(a);
        byte s = a.byteValue();
        float  s2 = a.floatValue();

        //引用类型名.基本数据类型Value()  //转换成基本数据类型
        //引用类型.valueOf(要转换的数据类型名) //转换成指定引用类型
        //
        Character fwe =new Character( 'e');
        Integer s3 =Integer.valueOf(fwe);
        System.out.println(s3);
        Character fwwe ='e';

        //包装类型.MAX_VALUE    获取最大值
        //包装类型.MIN_VALUE    获取最小值
        System.out.println(Integer.MIN_VALUE);
    }
    public static void doSome(Object obj){
        System.out.println(obj);
    }
    String saf = new String("fwew");

}
