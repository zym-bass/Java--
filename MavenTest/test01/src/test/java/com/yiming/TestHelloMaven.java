package com.yiming;


import org.junit.Assert;
import org.junit.Test;


public class TestHelloMaven {

    @Test
    public void testAdd(){
        HelloMaven hm = new HelloMaven();
        int res = hm.add(10,20);
        //判断结果是否正确
        Assert.assertEquals(30,res);
    }

}
