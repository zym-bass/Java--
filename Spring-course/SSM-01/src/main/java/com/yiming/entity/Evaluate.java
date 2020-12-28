package com.yiming.entity;

import java.util.Date;

public class Evaluate {
    private Integer evaid;

    private Integer forumfk;

    private Integer empfk;

    private Integer evaidfk;

    private Date updatetime;

    private Date evatime;

    private Integer evastatus;

    private String evacontent;

    public Integer getEvaid() {
        return evaid;
    }

    public void setEvaid(Integer evaid) {
        this.evaid = evaid;
    }

    public Integer getForumfk() {
        return forumfk;
    }

    public void setForumfk(Integer forumfk) {
        this.forumfk = forumfk;
    }

    public Integer getEmpfk() {
        return empfk;
    }

    public void setEmpfk(Integer empfk) {
        this.empfk = empfk;
    }

    public Integer getEvaidfk() {
        return evaidfk;
    }

    public void setEvaidfk(Integer evaidfk) {
        this.evaidfk = evaidfk;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Date getEvatime() {
        return evatime;
    }

    public void setEvatime(Date evatime) {
        this.evatime = evatime;
    }

    public Integer getEvastatus() {
        return evastatus;
    }

    public void setEvastatus(Integer evastatus) {
        this.evastatus = evastatus;
    }

    public String getEvacontent() {
        return evacontent;
    }

    public void setEvacontent(String evacontent) {
        this.evacontent = evacontent == null ? null : evacontent.trim();
    }
}