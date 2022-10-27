package com.agnitomedia.data;

import android.graphics.drawable.Drawable;

public class SavedStoriesData {
    private  String tittle ;
    private  String subtittle ;
    private Drawable ivStorys ;

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getSubtittle() {
        return subtittle;
    }

    public void setSubtittle(String subtittle) {
        this.subtittle = subtittle;
    }

    public Drawable getIvStorys() {
        return ivStorys;
    }

    public void setIvStorys(Drawable ivStorys) {
        this.ivStorys = ivStorys;
    }

    public SavedStoriesData(String tittle, String subtittle, Drawable ivStorys) {
        this.tittle = tittle;
        this.subtittle = subtittle;
        this.ivStorys = ivStorys;
    }
}
