package com.capol.shard.entity;

import java.util.Date;

/**
 * @Author Eric.He
 * @Description  id分表日志
 * @Date 2022/12/04
 */
public class LogId {
    private long id;
    private String comment;
    private Date createDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
