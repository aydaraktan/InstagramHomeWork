package com.example.instagram.data;

import com.example.instagram.R;
import com.example.instagram.models.LiteModel1;

import java.util.ArrayList;

public class LiteData1 {
    private ArrayList<LiteModel1> list;

    public ArrayList<LiteModel1> getList() {
        list = new ArrayList<>();
        list.add(new LiteModel1(R.drawable.image_lite));
        list.add(new LiteModel1(R.drawable.image_lite));
        list.add(new LiteModel1(R.drawable.image_lite));
        list.add(new LiteModel1(R.drawable.image_lite));
        list.add(new LiteModel1(R.drawable.image_lite));
        list.add(new LiteModel1(R.drawable.image_lite));

        return list;
    }
}
