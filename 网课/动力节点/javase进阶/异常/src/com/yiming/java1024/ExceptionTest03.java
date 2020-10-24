package com.yiming.java1024;

/*
 关于 try....catch中的finally语句：
    1.在finally语句中的代码是最后执行的，并且是一定会执行的，即使try语句块中的代码出现了异常
        finally语句必须和try一起出现，不能单独编写。
    2. finally语句通常使用在那些情况？

*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest03 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("E:\\Eclipse\\test\\bin\\com\\test\\segregation\\1.txt");
            String s = null;
            s.toString();
            System.out.println("sf");

        }catch(NullPointerException e) {
            e.printStackTrace();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        } finally{
            System.out.println("Hello ");
            if(fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("Hello435 ");
    }
}
