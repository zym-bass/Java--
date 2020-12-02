package com.yiming;

import com.yiming.factory.UsbKingFactory;
import com.yiming.handler.MySellHander;
import com.yiming.service.UsbSell;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MainShop {
    public static void main(String[] args) {
        //创建代理对象，使用Proxy
        //1. 创建目标对象
        UsbSell factory  = new UsbKingFactory();

        //2. 创建InvocationHandler对象
        InvocationHandler handler = new MySellHander(factory);


        //3. 创建代理对象
        UsbSell proxy =(UsbSell) Proxy.newProxyInstance(factory.getClass().getClassLoader(),
                factory.getClass().getInterfaces(),
                handler);

        //4. 通过代理执行方法
        float price = proxy.sell(1);
        System.out.println("通过动态代理方法对象，调用方法"+price);
    }
}
