package com.agnitomedia.data;

public class NftItemData {
    private  String name ;
    private  String prize ;
    private  String last_sale ;

    public String getNftCode() {
        return nftCode;
    }

    public void setNftCode(String nftCode) {
        this.nftCode = nftCode;
    }



    private  String nftCode ;
    private  int  nft ;

    public NftItemData(String name, String prize, String last_sale, int nft,String nftCode) {
        this.name = name;
        this.prize = prize;
        this.last_sale = last_sale;
        this.nft = nft;
        this.nftCode = nftCode;
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
        return last_sale;
    }

    public void setLast_sale(String last_sale) {
        this.last_sale = last_sale;
    }

    public int getNft() {
        return nft;
    }

    public void setNft(int nft) {
        this.nft = nft;
    }
}
