package com.agnitomedia.data;

import android.graphics.drawable.Drawable;

public class SavedNftsData {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Drawable getIvNfts() {
        return ivNfts;
    }

    public void setIvNfts(Drawable ivNfts) {
        this.ivNfts = ivNfts;
    }

    public SavedNftsData(String name, Drawable ivNfts) {
        this.name = name;
        this.ivNfts = ivNfts;
    }

    private Drawable ivNfts;

}