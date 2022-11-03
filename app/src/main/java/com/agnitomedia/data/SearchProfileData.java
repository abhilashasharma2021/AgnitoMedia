package com.agnitomedia.data;

public class SearchProfileData {
    private  String proName ;

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public int getIvProfile() {
        return ivProfile;
    }

    public void setIvProfile(int ivProfile) {
        this.ivProfile = ivProfile;
    }

    public SearchProfileData(String proName, int ivProfile) {
        this.proName = proName;
        this.ivProfile = ivProfile;
    }

    private int ivProfile ;


}
