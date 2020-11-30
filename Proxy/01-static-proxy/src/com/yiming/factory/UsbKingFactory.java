package com.yiming.factory;


import com.yiming.service.UsbSell;

//目标类 厂家 不接受用户单独购买
public class UsbKingFactory implements UsbSell {

    @Override
    public float sell(int amount) {
        //一个128G的u盘是85
        //后期根据amount
        return 85.0f;
    }
}
