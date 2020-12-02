package com.yiming.factory;

import com.yiming.service.UsbSell;


//目标类
public class UsbKingFactory implements UsbSell {

    @Override
    public float sell(int amount) {
       //目标方法
       return 85.0f;
    }
}
