package com.agnitomedia.data;

public class VideoData {
    private  String name ;
    private  String viewCount ;
    private  String likeCount ;
    private  String commentCount ;
    private  String shareCount ;
    private  String description ;
    private  String composerDetails ;
    private  int  ivReal ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getViewCount() {
        return viewCount;
    }

    public void setViewCount(String viewCount) {
        this.viewCount = viewCount;
    }

    public String getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(String likeCount) {
        this.likeCount = likeCount;
    }

    public String getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(String commentCount) {
        this.commentCount = commentCount;
    }

    public String getShareCount() {
        return shareCount;
    }

    public void setShareCount(String shareCount) {
        this.shareCount = shareCount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getComposerDetails() {
        return composerDetails;
    }

    public void setComposerDetails(String composerDetails) {
        this.composerDetails = composerDetails;
    }

    public int getIvReal() {
        return ivReal;
    }

    public void setIvReal(int ivReal) {
        this.ivReal = ivReal;
    }

    public int getIvProfile() {
        return ivProfile;
    }

    public void setIvProfile(int ivProfile) {
        this.ivProfile = ivProfile;
    }

    public VideoData(String name, String viewCount, String likeCount, String commentCount, String shareCount, String description, String composerDetails, int ivReal, int ivProfile) {
        this.name = name;
        this.viewCount = viewCount;
        this.likeCount = likeCount;
        this.commentCount = commentCount;
        this.shareCount = shareCount;
        this.description = description;
        this.composerDetails = composerDetails;
        this.ivReal = ivReal;
        this.ivProfile = ivProfile;
    }

    private  int  ivProfile ;


}
