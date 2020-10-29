package com.yiming.java28;

import java.io.FileWriter;
import java.io.IOException;
/*
    FileWriter 字符输出流
    只能对普通文档进行操作
*/
public class FileWriterTest01 {
    public static void main(String[] args) {
        FileWriter writer = null;
        try {
            writer = new FileWriter("temp");

            /*char[] chars = {97,98,99,100};

            writer.write(chars);*/
            writer.write("shjaghaegagajgo");
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
