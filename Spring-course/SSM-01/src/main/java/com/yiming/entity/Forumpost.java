package com.yiming.entity;

import java.util.Date;

public class Forumpost {
    private Integer forumid;

    private String forumtitle;

    private Date createtime;

    private Integer stats;

    private Integer empfk3;

    private String forumcontent;

    public Integer getForumid() {
        return forumid;
    }

    public void setForumid(Integer forumid) {
        this.forumid = forumid;
    }

    public String getForumtitle() {
        return forumtitle;
    }

    public void setForumtitle(String forumtitle) {
        this.forumtitle = forumtitle == null ? null : forumtitle.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getStats() {
        return stats;
    }

    public void setStats(Integer stats) {
        this.stats = stats;
    }

    public Integer getEmpfk3() {
        return empfk3;
    }

    public void setEmpfk3(Integer empfk3) {
        this.empfk3 = empfk3;
    }

    public String getForumcontent() {
        return forumcontent;
    }

    public void setForumcontent(String forumcontent) {
        this.forumcontent = forumcontent == null ? null : forumcontent.trim();
    }
}