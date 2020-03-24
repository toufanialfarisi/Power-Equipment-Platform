package com.example.powerequipment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class DataGridAdapter extends RecyclerView.Adapter<DataGridAdapter.DataGridViewHolder> {


    private ArrayList<DataController> list;

    public DataGridAdapter (ArrayList<DataController> list){
        this.list = list;
    }

    OnItemGridClickCallback onItemGridClickCallback;

    public void setOnItemGridClickCallback(OnItemGridClickCallback onItemGridClickCallback){
        this.onItemGridClickCallback = onItemGridClickCallback;
    }

    public interface OnItemGridClickCallback{
        void onItemClicked(DataController data);
    }

    @NonNull
    @Override
    public DataGridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_item_list, parent, false);
        return new DataGridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final DataGridViewHolder holder, final int position) {

        Glide.with(holder.itemView.getContext())
                .load(list.get(position).getFoto())
                .apply(new RequestOptions().override(350,350))
                .into(holder.imgGrid);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemGridClickCallback.onItemClicked(list.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class DataGridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgGrid;
        public DataGridViewHolder(@NonNull View itemView) {
            super(itemView);
            imgGrid = itemView.findViewById(R.id.img_grid);

        }
    }
}
