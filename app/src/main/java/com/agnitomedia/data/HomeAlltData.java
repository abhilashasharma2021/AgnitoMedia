package com.agnitomedia.data;

public class HomeAlltData {
    private  String name ;
    private  String position ;
    private  int  userImge ;
    private  int  postImge ;
    private  String likeCount ;
    private  String shareCount ;

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

    public int getUserImge() {
        return userImge;
    }

    public void setUserImge(int userImge) {
        this.userImge = userImge;
    }

    public int getPostImge() {
        return postImge;
    }

    public void setPostImge(int postImge) {
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

    public HomeAlltData(String name, String position, int userImge, int postImge, String likeCount, String shareCount, String commentCount, String likeName, String postDescription) {
        this.name = name;
        this.position = position;
        this.userImge = userImge;
        this.postImge = postImge;
        this.likeCount = likeCount;
        this.shareCount = shareCount;
        this.commentCount = commentCount;
        this.likeName = likeName;
        this.postDescription = postDescription;
    }

    private  String commentCount ;
    private  String likeName ;
    private  String postDescription ;


}
