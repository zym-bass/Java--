package com.yiming.java11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class IopropertiesTest01 {
    public static void main(String[] args) throws IOException {
        String path = Thread.currentThread().getContextClassLoader().getResource("com/yiming/java11/classinfo.properties").getPath();
        FileReader reader  = new FileReader(path);
        Properties pro = new Properties();
        pro.load(reader);
        reader.close();
        //通过key获取value
        String className = pro.getProperty("name");
        System.out.println(className);

        InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("com/yiming/java11/classinfo.properties");
        Properties pro2 = new Properties();
        pro2.load(in);
        in.close();

        String className02 = pro.getProperty("name");
        System.out.println(className02);

    }
}
