package com.yiming.java11;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectTest08 {
    public static void main(String[] args) throws ClassNotFoundException {

        //获取类
        Class s = Class.forName("com.yiming.java11.ArgsTest");

        //获取所有的Method(包括私有的)
        Method[] methods = s.getDeclaredMethods();

        for(Method method : methods){
            //获取修饰列表符
            System.out.println(Modifier.toString(method.getModifiers()));
            //获取方法的返回值类型
            System.out.println(method.getReturnType());
            //获取方法名
            System.out.println(method.getName());
            //获取参数列表
            Class[] parameterTypes =method.getParameterTypes();
            for(Class parameterType:parameterTypes){
                System.out.println(parameterType.getSimpleName());
            }

        }


    }
}
