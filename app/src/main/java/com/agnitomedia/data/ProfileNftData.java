package com.agnitomedia.data;

public class ProfileNftData {
    private  String likeCount ;

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

    public int getNft() {
        return nft;
    }

    public void setNft(int nft) {
        this.nft = nft;
    }

    public ProfileNftData(String likeCount, String commentCount, int nft) {
        this.likeCount = likeCount;
        this.commentCount = commentCount;
        this.nft = nft;
    }

    private  String commentCount ;
    private  int  nft ;


}
