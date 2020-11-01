package com.yiming.packet;

public class Test {
    public static void main(String[] args) {
        //创建账户对象（只创建）
        Account act =  new Account("act-001",10000);

        AccountThread t1 = new AccountThread(act);
        AccountThread t2 = new AccountThread(act);

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(act.getBalance());


    }
}

class AccountThread extends Thread{
    private Account act;

    public Account getAct() {
        return act;
    }

    public void setAct(Account act) {
        this.act = act;
    }

    public AccountThread(Account act){
        this.act= act;
    }

    @Override
    public void run() {
        //执行取款机制
        act.doSome(5000);
        System.out.println("余额为：" + act.getBalance());
    }
}
