package com.example.instagram.ui.fragments.home;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.instagram.R;
import com.example.instagram.data.DataHome;
import com.example.instagram.databinding.FragmentHomeBinding;


public class Home extends Fragment {
    private DataHome data;
    private RvAdapter adapter;
    private FragmentHomeBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentHomeBinding.inflate(inflater,container,false);
        View view = binding.getRoot();
        // Inflate the layout for this fragment
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initRecycler();
        initListener();
    }

    private void initListener() {

        binding.homePhoto.setOnClickListener(view -> {
            Intent intent =new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivity(intent);
        });
    }

    private void initRecycler() {
        data = new DataHome();
        adapter = new RvAdapter();
        adapter.setList(data.getList());
        binding.homeRv.setAdapter(adapter);
    }
}