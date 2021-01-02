package com.yiming.domain;

public class Dept {
    private Integer deptno;
    private String dname;
    private String dlocation;

    public Dept() {
        super();
    }

    public Dept(Integer deptno, String dname, String dlocation) {
        this.deptno = deptno;
        this.dname = dname;
        this.dlocation = dlocation;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDlocation() {
        return dlocation;
    }

    public void setDlocation(String dlocation) {
        this.dlocation = dlocation;
    }


    @Override
    public String toString() {
        return "Dept{" +
                "deptno=" + deptno +
                ", dname='" + dname + '\'' +
                ", dlocation='" + dlocation + '\'' +
                '}';
    }
}
