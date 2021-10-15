package com.example.instagram.models;


public class ModelHome {
    private Integer img;
    private String text1,text2;

    public ModelHome(Integer img, String text1, String text2) {
        this.img = img;
        this.text1 = text1;
        this.text2 = text2;
    }

    public Integer getImg() {
        return img;
    }

    public String getText1() {
        return text1;
    }

    public String getText2() {
        return text2;
    }
}
