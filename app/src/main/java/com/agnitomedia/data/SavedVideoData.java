package com.agnitomedia.data;

import android.graphics.drawable.Drawable;

public class SavedVideoData {
    private String name;
    private String views;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public Drawable getIvVideo() {
        return ivVideo;
    }

    public void setIvVideo(Drawable ivVideo) {
        this.ivVideo = ivVideo;
    }

    public SavedVideoData(String name, String views, Drawable ivVideo) {
        this.name = name;
        this.views = views;
        this.ivVideo = ivVideo;
    }

    private Drawable ivVideo;

}