package com.agnitomedia.data;

public class ViewAllProfileData {
    private  String proName ;
    private  String proDescription;

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getProDescription() {
        return proDescription;
    }

    public void setProDescription(String proDescription) {
        this.proDescription = proDescription;
    }

    public int getIvProfile() {
        return ivProfile;
    }

    public void setIvProfile(int ivProfile) {
        this.ivProfile = ivProfile;
    }

    public ViewAllProfileData(String proName, String proDescription, int ivProfile) {
        this.proName = proName;
        this.proDescription = proDescription;
        this.ivProfile = ivProfile;
    }

    private int ivProfile ;


}
