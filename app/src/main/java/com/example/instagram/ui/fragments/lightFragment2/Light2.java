package com.example.instagram.ui.fragments.lightFragment2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.instagram.R;
import com.example.instagram.data.LiteData2;
import com.example.instagram.databinding.FragmentLite2Binding;


public class Light2 extends Fragment {
    private LiteData2 data;
    private Lite2Adapter adapter;
    private FragmentLite2Binding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentLite2Binding.inflate(inflater, container, false);
        View view = binding.getRoot();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initRecycler();
    }

    private void initRecycler() {
        adapter = new Lite2Adapter();
        data = new LiteData2();
        adapter.setList(data.getList());
        binding.rvLite2.setAdapter(adapter);
    }

}