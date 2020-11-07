package com.yiming.reflect;

/*
    Class.forName()发生了什么？
        如果只希望静态代码块执行了
            可以使用Class.forName("完整类名");
            这个方法的执行会导致类加载，类加载时，静态代码块执行
*/
public class ReflectTest03 {
    public static void main(String[] args) {
        try {
            Class.forName("com.yiming.reflect.User");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
