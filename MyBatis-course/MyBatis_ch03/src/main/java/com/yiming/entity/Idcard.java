package com.yiming.entity;

import java.util.Date;

public class Idcard {
    private  int id ;
    private  String cardno;
    private Date uselife;
    private  Person2 person2;

    public Idcard() {
        super();
    }

    public Idcard(String cardno, Date uselife, Person2 person2) {
        this.cardno = cardno;
        this.uselife = uselife;
        this.person2 = person2;
    }

    public Idcard(int id, String cardno, Date uselife, Person2 person2) {
        this.id = id;
        this.cardno = cardno;
        this.uselife = uselife;
        this.person2 = person2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public Date getUselife() {
        return uselife;
    }

    public void setUselife(Date uselife) {
        this.uselife = uselife;
    }

    public Person2 getPerson2() {
        return person2;
    }

    public void setPerson2(Person2 person2) {
        this.person2 = person2;
    }

    @Override
    public String toString() {
        return "Idcard{" +
                "id=" + id +
                ", cardno='" + cardno + '\'' +
                ", uselife=" + uselife +
                ", person2=" + person2 +
                '}';
    }
}
