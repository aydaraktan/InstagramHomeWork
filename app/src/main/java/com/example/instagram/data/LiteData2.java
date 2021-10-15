package com.example.instagram.data;

import com.example.instagram.R;
import com.example.instagram.models.LiteModel2;

import java.util.ArrayList;

public class LiteData2 {
    private ArrayList<LiteModel2> list;

    public ArrayList<LiteModel2> getList() {
        list = new ArrayList<>();
        list.add(new LiteModel2(R.drawable.image_lite));
        list.add(new LiteModel2(R.drawable.image_lite));
        list.add(new LiteModel2(R.drawable.image_lite));
        list.add(new LiteModel2(R.drawable.image_lite));
        list.add(new LiteModel2(R.drawable.image_lite));
        list.add(new LiteModel2(R.drawable.image_lite));
        list.add(new LiteModel2(R.drawable.image_lite));

        return list;
    }

}
