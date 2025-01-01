package com.example.likecomment;

public class dataclass {
private  int imageId1,imageId2,likeId,commentId,shareId;
private String text1,hrs,allText;

    public dataclass(int imageId1, int imageId2, int likeId, int commentId, int shareId, String text1, String hrs, String allText) {
        this.imageId1 = imageId1;
        this.imageId2 = imageId2;
        this.likeId = likeId;
        this.commentId = commentId;
        this.shareId = shareId;
        this.text1 = text1;
        this.hrs = hrs;
        this.allText = allText;
    }

    public int getImageId1() {
        return imageId1;
    }

    public void setImageId1(int imageId1) {
        this.imageId1 = imageId1;
    }

    public int getImageId2() {
        return imageId2;
    }

    public void setImageId2(int imageId2) {
        this.imageId2 = imageId2;
    }

    public int getLikeId() {
        return likeId;
    }

    public void setLikeId(int likeId) {
        this.likeId = likeId;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public int getShareId() {
        return shareId;
    }

    public void setShareId(int shareId) {
        this.shareId = shareId;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getHrs() {
        return hrs;
    }

    public void setHrs(String hrs) {
        this.hrs = hrs;
    }

    public String getAllText() {
        return allText;
    }

    public void setAllText(String allText) {
        this.allText = allText;
    }
}
