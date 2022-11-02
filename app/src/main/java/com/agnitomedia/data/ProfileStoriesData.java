package com.agnitomedia.data;

public class ProfileStoriesData {
    private  String tittle ;
    private  String catName ;
    private  String description ;
    private int ivStorys ;

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIvStorys() {
        return ivStorys;
    }

    public void setIvStorys(int ivStorys) {
        this.ivStorys = ivStorys;
    }

    public ProfileStoriesData(String tittle, String catName, String description, int ivStorys) {
        this.tittle = tittle;
        this.catName = catName;
        this.description = description;
        this.ivStorys = ivStorys;
    }
}
