package com.yiming.java1101;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class IoPropertiesTest01 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("F:\\Java--\\网课\\动力节点\\javase进阶\\Io流\\src\\com\\yiming\\java1101\\userinfo");

        Properties pro = new Properties();

        pro.load(reader);

        String username = pro.getProperty("username");
        System.out.println(username);

        String password = pro.getProperty("password");
        System.out.println(password);
    }


}
