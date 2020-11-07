package com.yiming.reflect;

public class User {
    int name;

    static {
        System.out.println("静态代码块执行了");
    }

    public User() {
        super();
        System.out.println("无参数构造");
    }
}
