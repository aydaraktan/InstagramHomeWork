package com.example.instagram.ui.fragments.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagram.databinding.ItemHomeRvBinding;
import com.example.instagram.models.ModelHome;

import java.util.ArrayList;

public class RvAdapter extends RecyclerView.Adapter<RvAdapter.ViewHolder> {

    private ArrayList<ModelHome> list = new ArrayList<>();

    public void setList(ArrayList<ModelHome> list) {
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemHomeRvBinding binding=ItemHomeRvBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);

        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ItemHomeRvBinding binding;
        public ViewHolder(@NonNull ItemHomeRvBinding binding) {
            super(binding.getRoot());
            this.binding=binding;

        }

        public void onBind(ModelHome modelHome) {
            binding.imageHome.setImageResource(modelHome.getImg());
            binding.textHome1.setText(modelHome.getText1());
            binding.textHome2.setText(modelHome.getText2());
        }
    }
}
