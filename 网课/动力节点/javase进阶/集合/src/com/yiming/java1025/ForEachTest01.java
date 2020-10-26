package com.yiming.java1025;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    JDK5.0之后推出了一个新特性：叫做增强for循环，或者叫做foreach
*/
public class ForEachTest01 {
    public static void main(String[] args) {
        //int 类型数组
        int [] arr = {1,24,42342,352,53,53};
        //增强for循环
       /* 语法：
        for(元素类型 变量名 : 数组或集合){
            System.out.println(变量名);
        }*/
        //缺点没有下标
        for(int i : arr){
            System.out.println(i);
        }

        //集合
        List<String> strList = new ArrayList<>();
        strList.add("123");
        strList.add("34");
        strList.add("14");
        strList.add("14");

        Iterator<String> it = strList.iterator();
        while(it.hasNext()){
            String s =  it.next();
            System.out.println(s);
        }

        //使用下标
        for(int i = 0 ; i<strList.size() ; i++){
            System.out.println(strList.get(i));
        }
        //使用forEach
        for(String s : strList ){
            System.out.println(s);
        }
    }
}
