package com.yiming;

import com.yiming.handler.TapBao;

public class ShopMain {
    public static void main(String[] args) {
        //创建代理的商家taobao对象
        TapBao tapBao = new TapBao();
        float price = tapBao.sell(1);
        System.out.println("通过淘宝的商家，购买u盘的单价："+price);
    }
}
