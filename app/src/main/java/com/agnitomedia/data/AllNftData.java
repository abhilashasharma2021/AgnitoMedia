package com.agnitomedia.data;

public class AllNftData {
    private  String name ;
    private  String prize ;
    private  String code ;
    private  int  nft ;

    public AllNftData(String name, String prize, String code, int nft) {
        this.name = name;
        this.prize = prize;
        this.code = code;
        this.nft = nft;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrize() {
        return prize;
    }

    public void setPrize(String prize) {
        this.prize = prize;
    }

    public String getLast_sale() {
        return code;
    }

    public void setLast_sale(String last_sale) {
        this.code = last_sale;
    }

    public int getNft() {
        return nft;
    }

    public void setNft(int nft) {
        this.nft = nft;
    }
}
