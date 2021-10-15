package com.example.instagram.ui.fragments.lightFragment2;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagram.databinding.ItemFragmentLite2Binding;
import com.example.instagram.models.LiteModel2;

import java.util.ArrayList;

public class Lite2Adapter extends RecyclerView.Adapter<Lite2Adapter.ViewHolder> {
    private ArrayList<LiteModel2> list;

    @SuppressLint("NotifyDataSetChanged")
    public void setList(ArrayList<LiteModel2> list) {
        this.list = new ArrayList<>();
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemFragmentLite2Binding binding = ItemFragmentLite2Binding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
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
        private ItemFragmentLite2Binding binding;

        public ViewHolder(@NonNull ItemFragmentLite2Binding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void onBind(LiteModel2 liteModel2) {
            binding.frLite2Img.setImageResource(liteModel2.getImg());
        }
    }
}
