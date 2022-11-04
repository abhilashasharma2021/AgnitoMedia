package com.agnitomedia.data;

public class ReplyShowData {
    private  String name ;
    private  String message ;
    private  String replyCount ;
    private  String likeCount ;
    private  String days ;
    private  int image ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(String replyCount) {
        this.replyCount = replyCount;
    }

    public String getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(String likeCount) {
        this.likeCount = likeCount;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public ReplyShowData(String name, String message, String replyCount, String likeCount, String days, int image) {
        this.name = name;
        this.message = message;
        this.replyCount = replyCount;
        this.likeCount = likeCount;
        this.days = days;
        this.image = image;
    }
}
