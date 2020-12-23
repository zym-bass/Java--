package com.yiming.Factory;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.InvocationHandler;

import java.lang.reflect.Method;

public class CglibFactory implements InvocationHandler {
    private Object targetObject;

    public Object createProxyInstance(Object targetObject) {
        this.targetObject=targetObject;
        Enhancer enhancer = new Enhancer();
        //设置代理类的父类
        enhancer.setSuperclass(targetObject.getClass());
        //设置回调方法
        enhancer.setCallback(this);
        //创建代理对象
        return enhancer.create();
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {

        Object result=null;
        try{
            //.....
            //回调目标类
            result=method.invoke(targetObject,objects);
            //....
        }catch(Exception e){
            e.printStackTrace();
            //...
        }finally{

        }
        return result;
    }
}
