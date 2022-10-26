package com.agnitomedia.data;

import android.graphics.drawable.Drawable;

public class HomeStoryData {
    private  String name ;
    private  String position ;
    private Drawable userImge ;
    private  Drawable  postImge ;
    private  String likeCount ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Drawable getUserImge() {
        return userImge;
    }

    public void setUserImge(Drawable userImge) {
        this.userImge = userImge;
    }

    public Drawable getPostImge() {
        return postImge;
    }

    public void setPostImge(Drawable postImge) {
        this.postImge = postImge;
    }

    public String getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(String likeCount) {
        this.likeCount = likeCount;
    }

    public String getShareCount() {
        return shareCount;
    }

    public void setShareCount(String shareCount) {
        this.shareCount = shareCount;
    }

    public String getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(String commentCount) {
        this.commentCount = commentCount;
    }

    public String getLikeName() {
        return likeName;
    }

    public void setLikeName(String likeName) {
        this.likeName = likeName;
    }

    public String getPostDescription() {
        return postDescription;
    }

    public void setPostDescription(String postDescription) {
        this.postDescription = postDescription;
    }

    public String getPostTittle() {
        return postTittle;
    }

    public void setPostTittle(String postTittle) {
        this.postTittle = postTittle;
    }

    public String getPostSubTittle() {
        return postSubTittle;
    }

    public void setPostSubTittle(String postSubTittle) {
        this.postSubTittle = postSubTittle;
    }

    public HomeStoryData(String name, String position, Drawable userImge, Drawable postImge, String likeCount, String shareCount, String commentCount, String likeName, String postDescription, String postTittle, String postSubTittle) {
        this.name = name;
        this.position = position;
        this.userImge = userImge;
        this.postImge = postImge;
        this.likeCount = likeCount;
        this.shareCount = shareCount;
        this.commentCount = commentCount;
        this.likeName = likeName;
        this.postDescription = postDescription;
        this.postTittle = postTittle;
        this.postSubTittle = postSubTittle;
    }

    private  String shareCount ;
    private  String commentCount ;
    private  String likeName ;
    private  String postDescription ;
    private  String postTittle ;
    private  String postSubTittle;

}
