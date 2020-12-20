package com.yiming.entity;

public class Employee {
    private Integer eId;

    private String eName;

    private String eGender;

    private Integer eDepartId;

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName == null ? null : eName.trim();
    }

    public String geteGender() {
        return eGender;
    }

    public void seteGender(String eGender) {
        this.eGender = eGender == null ? null : eGender.trim();
    }

    public Integer geteDepartId() {
        return eDepartId;
    }

    public void seteDepartId(Integer eDepartId) {
        this.eDepartId = eDepartId;
    }
}