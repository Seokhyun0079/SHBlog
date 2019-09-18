package com.my.blog.freeboard.vo;

public class CommentRequest {
    FreeboardComment comment;
    private int beforeCount;
    private int afterCount;

    public int getBeforeCount() {
        return beforeCount;
    }

    public void setBeforeCount(int beforeCount) {
        this.beforeCount = beforeCount;
    }

    public int getAfterCount() {
        return afterCount;
    }

    public void setAfterCount(int afterCount) {
        this.afterCount = afterCount;
    }

    public FreeboardComment getComment() {
        return comment;
    }

    public void setComment(FreeboardComment comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "CommentRequest{" +
                "comment=" + comment +
                ", beforeCount=" + beforeCount +
                ", afterCount=" + afterCount +
                '}';
    }
}
