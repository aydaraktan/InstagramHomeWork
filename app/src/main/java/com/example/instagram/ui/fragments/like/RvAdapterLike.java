package com.example.instagram.ui.fragments.like;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagram.databinding.ItemHomeRvBinding;
import com.example.instagram.databinding.ItemLikeRvBinding;
import com.example.instagram.models.ModelHome;
import com.example.instagram.models.ModelLike;
import com.example.instagram.ui.fragments.home.RvAdapter;

import java.util.ArrayList;

public class RvAdapterLike extends RecyclerView.Adapter<RvAdapterLike.ViewHolder> {

    private ArrayList<ModelLike> list = new ArrayList<>();

    public void setList(ArrayList<ModelLike> list) {
        this.list.addAll(list);
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemLikeRvBinding binding=ItemLikeRvBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);

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
        private ItemLikeRvBinding binding;
        public ViewHolder(@NonNull ItemLikeRvBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }

        public void onBind(ModelLike modelLike) {
            binding.imageLike1.setImageResource(modelLike.getImg());
            binding.imageLike2.setImageResource(modelLike.getImg2());
            binding.txtlike.setText(modelLike.getText1());
        }
    }
}
