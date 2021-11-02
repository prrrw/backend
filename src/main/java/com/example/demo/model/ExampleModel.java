package com.example.demo.model;

public class ExampleModel {
    private Long imgId;
    private String imgTitle;
    private String imgUrl;
    private String imgDate;
    private String imgDesc;

    public ExampleModel(Long imgId, String imgTitle, String imgUrl, String imgDate, String imgDesc){
        super();
        this.imgId = imgId;
        this.imgTitle = imgTitle;
        this.imgUrl = imgUrl;
        this.imgDate = imgDate;
        this.imgDesc = imgDesc;
    }

    public Long getImgId() {
        return imgId;
    }

    public void setImgId(Long index) {
        this.imgId = index;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imageUrl) {
        this.imgUrl = imageUrl;
    }

    public String getImgTitle() {
        return imgTitle;
    }

    public void setImgTitle(String imageTitle) {
        this.imgTitle = imageTitle;
    }

    public String getImgDate() {
        return imgDate;
    }

    public void setImgDate(String imageDate) {
        this.imgDate = imageDate;
    }

    public String getImgDesc() {
        return imgDesc;
    }

    public void setImgDesc(String imageDesc) {
        this.imgDesc = imageDesc;
    }
}
