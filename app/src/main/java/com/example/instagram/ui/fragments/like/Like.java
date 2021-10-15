package com.example.instagram.ui.fragments.like;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.instagram.R;
import com.example.instagram.data.DataHome;
import com.example.instagram.data.DataLike;
import com.example.instagram.databinding.FragmentHomeBinding;
import com.example.instagram.databinding.FragmentLikeBinding;
import com.example.instagram.ui.fragments.home.RvAdapter;

public class Like extends Fragment {
    private RvAdapterLike adapter;
    private DataLike data;
    private FragmentLikeBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding= FragmentLikeBinding.inflate(inflater,container,false);
        View view = binding.getRoot();

        // Inflate the layout for this fragment
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initRecycler();
    }

    private void initRecycler() {
        adapter=new RvAdapterLike();
        data=new DataLike();
        adapter.setList(data.getList());
        binding.likeRv.setAdapter(adapter);
    }
}