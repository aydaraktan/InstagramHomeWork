package com.example.instagram.data;

import com.example.instagram.R;
import com.example.instagram.models.ModelHome;

import java.util.ArrayList;

public class DataHome {
    private ArrayList<ModelHome> list;

    public ArrayList<ModelHome> getList() {
        list = new ArrayList<>();
        list.add(new ModelHome(R.drawable.home_image,"joshua_l The game in Japan was amazing and I want to share some photos","September 19"));
        list.add(new ModelHome(R.drawable.home_image,"joshua_l The game in Japan was amazing and I want to share some photos","September 19"));
        list.add(new ModelHome(R.drawable.home_image,"joshua_l The game in Japan was amazing and I want to share some photos","September 19"));
        list.add(new ModelHome(R.drawable.home_image,"joshua_l The game in Japan was amazing and I want to share some photos","September 19"));
        list.add(new ModelHome(R.drawable.home_image,"joshua_l The game in Japan was amazing and I want to share some photos","September 19"));
        list.add(new ModelHome(R.drawable.home_image,"joshua_l The game in Japan was amazing and I want to share some photos","September 19"));
        list.add(new ModelHome(R.drawable.home_image,"joshua_l The game in Japan was amazing and I want to share some photos","September 19"));
        list.add(new ModelHome(R.drawable.home_image,"joshua_l The game in Japan was amazing and I want to share some photos","September 19"));

        return list;
    }
}
