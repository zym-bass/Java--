package com.yiming.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;



//必须实现InvocationHandler接口，完成代理类要做的功能(1. 调用目标方法 2. 增强功能)
public class MySellHander implements InvocationHandler {

    private Object target = null;

    //动态代理：目标对象是活动的，不是固定的
    //传入是谁，就给谁创建代理
    public MySellHander(Object target){
        this.target=target;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object res = null;
        //向厂家发送订单，告诉厂家，需要优盘开始进货
       /* float price = factory.sell(amount);//厂家的价格*/

        res =  method.invoke(target,args);
        //商家 需要加价，也就是代理要增加价格
        if(res!=null) {
            Float price = (Float) res;
            price += 25;
            res = price;
        }

        return res;
    }
}
