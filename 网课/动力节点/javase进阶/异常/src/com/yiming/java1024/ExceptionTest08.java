package com.yiming.java1024;

public class ExceptionTest08 {
    public static void main(String[] args){
        /*MyException m = new MyException("用户名不能为空") ;
        m.printStackTrace();
        String age = m.getMessage();
        System.out.println(age);*/
        int i = 0;
        for( i = 0 ; i<200;i++){
            try{
                doSome(i);
            }catch(MyException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println(i);
        /*try{
            for( i = 0 ; i<200;i++) {
                doSome(i);
            }
        }catch(MyException e){
            System.out.println(e.getMessage());
        }
        System.out.println(i);*/

    }
    public static void doSome(int i)throws MyException {
        if (i == 100) {
            throw new MyException("i的值到达100");
        }
    }
}


class MyException extends RuntimeException {
    public MyException(){
        super();
    }

    public MyException(String s ){
        super(s);
    }
}
