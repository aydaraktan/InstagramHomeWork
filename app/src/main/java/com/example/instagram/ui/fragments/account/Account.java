package com.example.instagram.ui.fragments.account;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.instagram.R;
import com.example.instagram.databinding.FragmentAccountBinding;
import com.example.instagram.ui.fragments.lightFragment1.Light1;
import com.example.instagram.ui.fragments.lightFragment2.Light2;
import com.google.android.material.tabs.TabLayoutMediator;

import java.io.IOException;
import java.util.ArrayList;


public class Account extends Fragment {
    private FragmentAccountBinding binding;
    private ViewPagerAdapter adapter;
    private ArrayList<Fragment> list;
    private Integer[] titleTab;
    private final Integer PICK_IMAGE = 1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAccountBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViewPager();
        initListeners();
    }

    private void initListeners() {
        binding.accountIv1.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_PICK);
            intent.setType("image/*");
            startActivityForResult(intent, PICK_IMAGE);
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == PICK_IMAGE && resultCode == Activity.RESULT_OK && data != null){
            Uri selectedImage = data.getData();
            try {
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(getActivity().getContentResolver(), selectedImage);
                binding.accountIv1.setImageBitmap(bitmap);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void initViewPager() {
        adapter = new ViewPagerAdapter(this);
        adapter.setList(getList());
        binding.containerLikeBottom.setAdapter(adapter);
        titleTab = new Integer[]{R.drawable.tab_icon_1, R.drawable.tab_icon_2};
        new TabLayoutMediator(binding.tabLayoutLike, binding.containerLikeBottom, (tab, position) -> {
            tab.setIcon(titleTab[position]);
        }).attach();
    }

    private ArrayList<Fragment> getList() {
        list = new ArrayList<>();
        list.add(new Light1());
        list.add(new Light2());
        return list;
    }
}