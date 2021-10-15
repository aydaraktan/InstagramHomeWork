package com.example.instagram.ui.fragments.lightFragment1;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagram.databinding.ItemFragmentLite1Binding;
import com.example.instagram.models.LiteModel1;

import java.util.ArrayList;

public class Lite1Adapter extends RecyclerView.Adapter<Lite1Adapter.ViewHolder> {
    private ArrayList<LiteModel1>list;

    @SuppressLint("NotifyDataSetChanged")
    public void setList(ArrayList<LiteModel1> list) {
        this.list = new ArrayList<>();
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemFragmentLite1Binding binding = ItemFragmentLite1Binding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
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
        private ItemFragmentLite1Binding binding;

        public ViewHolder(@NonNull ItemFragmentLite1Binding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void onBind(LiteModel1 liteModel1) {
            binding.frLite1Img.setImageResource(liteModel1.getImg());
        }
    }
}
