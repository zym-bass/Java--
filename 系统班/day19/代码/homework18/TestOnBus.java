package com.ujiuye.homework18;

public class TestOnBus {

	public static void main(String[] args) {
        OnBus on = new OnBus();
        
        Thread t1 = new Thread(on, "ǰ��");
        Thread t2 = new Thread(on, "����");
        Thread t3 = new Thread(on, "����");
        
        t1.start();
        t2.start();
        t3.start();
	}

}
