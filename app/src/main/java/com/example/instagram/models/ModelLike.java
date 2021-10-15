package com.example.instagram.models;

public class ModelLike {
    private Integer img,img2;
    private String text1;

    public ModelLike(Integer img, Integer img2, String text1) {
        this.img = img;
        this.img2 = img2;
        this.text1 = text1;
    }

    public Integer getImg() {
        return img;
    }

    public Integer getImg2() {
        return img2;
    }

    public String getText1() {
        return text1;
    }
}
