package com.yiming.handler;

import com.yiming.factory.UsbKingFactory;
import com.yiming.service.UsbSell;

public class TapBao  implements UsbSell {

    //声明 商家代理的厂家具体是谁
    private UsbKingFactory  factory = new UsbKingFactory();


    @Override
    //实现销售U盘功能
    public float sell(int amount) {
        //向厂家发送订单，告诉厂家，需要优盘开始进货
        float price = factory.sell(amount);//厂家的价格

        //商家 需要加价，也就是代理要增加价格
        price+=25;

        return price;
    }
}
