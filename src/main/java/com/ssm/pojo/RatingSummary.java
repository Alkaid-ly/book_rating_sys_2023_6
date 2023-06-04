package com.ssm.pojo;

public class RatingSummary {
    private Integer bookId;
    private Double totalScore;
    private Integer ratingCount;

    @Override
    public String toString() {
        return "RatingSummary{" +
                "bookId=" + bookId +
                ", totalScore=" + totalScore +
                ", ratingCount=" + ratingCount +
                '}';
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Double getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Double totalScore) {
        this.totalScore = totalScore;
    }

    public Integer getRatingCount() {
        return ratingCount;
    }

    public void setRatingCount(Integer ratingCount) {
        this.ratingCount = ratingCount;
    }
}
