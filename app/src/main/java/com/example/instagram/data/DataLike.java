package com.example.instagram.data;

import com.example.instagram.R;
import com.example.instagram.models.ModelLike;

import java.util.ArrayList;

public class DataLike {
    private ArrayList<ModelLike> list;

    public ArrayList<ModelLike> getList() {
        list = new ArrayList<>();
        list.add(new ModelLike(R.drawable.baba_icon,  R.drawable.pole_icon,"karennne liked your photo. 1h"));
        list.add(new ModelLike(R.drawable.baba_icon,  R.drawable.pole_icon,"karennne liked your photo. 1h"));
        list.add(new ModelLike(R.drawable.baba_icon,  R.drawable.pole_icon,"karennne liked your photo. 1h"));
        list.add(new ModelLike(R.drawable.baba_icon,  R.drawable.pole_icon,"karennne liked your photo. 1h"));
        list.add(new ModelLike(R.drawable.baba_icon,  R.drawable.pole_icon,"karennne liked your photo. 1h"));
        list.add(new ModelLike(R.drawable.baba_icon,  R.drawable.pole_icon,"karennne liked your photo. 1h"));
        list.add(new ModelLike(R.drawable.baba_icon,  R.drawable.pole_icon,"karennne liked your photo. 1h"));
        return list;
    }
}
