package com.yiming.java1024;

public class ExceptionTest05 {
    public static void main(String[] args){
        try{
            System.out.println("try....." );

            //退出JVM
            System.exit(0);
        }finally{
            System.out.println("fianlly") ;
        }
    }
}
