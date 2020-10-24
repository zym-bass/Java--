package com.yiming.java1024;


/*
    java语法规则（有一些规则是不能破坏的）
        方法体中的代码必须遵循自上而下顺序依次执行
        return语句一旦执行，整个方法必须结束
*/
public class ExceptionTest06 {
    public static void main(String[] args){
        int result = m();
        System.out.println(result);
    }

    public static int m(){
        int i = 100;
        try{
            return i;
        }finally{
            i++;
        }
    }
}
/*
public static int m(){
    int i =  100 ;
    int j = i ;
    i++;
    return j;
}*/
