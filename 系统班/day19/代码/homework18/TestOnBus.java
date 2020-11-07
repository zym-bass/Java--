package com.ujiuye.homework18;

public class TestOnBus {

	public static void main(String[] args) {
        OnBus on = new OnBus();
        
        Thread t1 = new Thread(on, "前门");
        Thread t2 = new Thread(on, "中门");
        Thread t3 = new Thread(on, "后门");
        
        t1.start();
        t2.start();
        t3.start();
	}

}
