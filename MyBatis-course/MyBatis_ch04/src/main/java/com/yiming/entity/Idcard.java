package com.yiming.entity;

import java.util.Date;

public class Idcard {
    private Integer iId;

    private String iCardno;

    private Date iUselife;

    private Integer iPerson2Id;

    public Integer getiId() {
        return iId;
    }

    public void setiId(Integer iId) {
        this.iId = iId;
    }

    public String getiCardno() {
        return iCardno;
    }

    public void setiCardno(String iCardno) {
        this.iCardno = iCardno == null ? null : iCardno.trim();
    }

    public Date getiUselife() {
        return iUselife;
    }

    public void setiUselife(Date iUselife) {
        this.iUselife = iUselife;
    }

    public Integer getiPerson2Id() {
        return iPerson2Id;
    }

    public void setiPerson2Id(Integer iPerson2Id) {
        this.iPerson2Id = iPerson2Id;
    }
}