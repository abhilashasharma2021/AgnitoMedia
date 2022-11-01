package com.agnitomedia.data;

import android.graphics.drawable.Drawable;

public class SliderItemData {
    private String tittle;
    private String createdBy;
    private String createdDate;
    private String viewsCount;
    private String catName;
    private Drawable ivSlider;

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getViewsCount() {
        return viewsCount;
    }

    public void setViewsCount(String viewsCount) {
        this.viewsCount = viewsCount;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public Drawable getIvSlider() {
        return ivSlider;
    }

    public void setIvSlider(Drawable ivSlider) {
        this.ivSlider = ivSlider;
    }

    public SliderItemData(String tittle, String createdBy, String createdDate, String viewsCount, String catName, Drawable ivSlider) {
        this.tittle = tittle;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.viewsCount = viewsCount;
        this.catName = catName;
        this.ivSlider = ivSlider;
    }
}
