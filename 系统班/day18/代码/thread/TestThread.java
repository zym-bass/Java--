package com.ujiuye.thread;

public class TestThread {

	public static void main(String[] args) {
        // main�����������һ���߳�
		
		// �ٶ��ⴴ��������һ���߳�
		//3)������һ���Զ����߳������
		MyThread my = new MyThread();
		
        // 4)  Thread(Runnable target) : ����Ҫ���е��߳�������װ��һ��Thread������, �Ժ��߳����еľ��ǲ���target�е��߳�����		
	    Thread th = new Thread(my);
	    
	    // 5) ����th��start��������my�߳�������
	    th.start();
	    
	    for(int i= 1; i <= 10; i++) {
	    	System.out.println("main---" + i);
	    }
	}

}
