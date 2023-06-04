package com.ssm.pojo;

import java.util.Date;

public class Rating {
    private Integer ratingId;
    private Integer userId;
    private Integer bookId;
    private Double soure;
    private String text;
    private Date createTime;

    public Integer getRatingId() {
        return ratingId;
    }

    public void setRatingId(Integer ratingId) {
        this.ratingId = ratingId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Double getSoure() {
        return soure;
    }

    public void setSoure(Double soure) {
        this.soure = soure;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "ratingId=" + ratingId +
                ", userId=" + userId +
                ", bookId=" + bookId +
                ", soure=" + soure +
                ", text='" + text + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
