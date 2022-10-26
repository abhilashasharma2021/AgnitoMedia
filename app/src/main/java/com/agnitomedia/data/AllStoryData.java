package com.agnitomedia.data;

import android.graphics.drawable.Drawable;

public class AllStoryData {
    private  String tittle ;
    private  String description ;
    private  Drawable  storyImg ;
    private  String date ;
    private  String autorizedBy ;


    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Drawable getStoryImg() {
        return storyImg;
    }

    public void setStoryImg(Drawable storyImg) {
        this.storyImg = storyImg;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAutorizedBy() {
        return autorizedBy;
    }

    public void setAutorizedBy(String autorizedBy) {
        this.autorizedBy = autorizedBy;
    }

    public AllStoryData(String tittle, String description, Drawable storyImg, String date, String autorizedBy) {
        this.tittle = tittle;
        this.description = description;
        this.storyImg = storyImg;
        this.date = date;
        this.autorizedBy = autorizedBy;
    }
}
