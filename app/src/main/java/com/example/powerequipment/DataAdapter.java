package com.example.powerequipment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.DataViewHolder> {

    private ArrayList<DataController> list;

    public DataAdapter(ArrayList<DataController> list){
        this.list = list;
    }

    OnItemPowerClickCallback onItemPowerClickCallback;

    public void setOnItemPowerClickCallback(OnItemPowerClickCallback onItemPowerClickCallback){
        this.onItemPowerClickCallback = onItemPowerClickCallback;
    }

    public interface OnItemPowerClickCallback{
        void onItemClicked(DataController data);
    }

    @NonNull
    @Override
    public DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new DataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final DataViewHolder holder, int position) {
        DataController data = list.get(position);
        Glide.with(holder.itemView.getContext())
                .load(data.getFoto())
                .apply(new RequestOptions().override(50, 50))
                .into(holder.photo);

        holder.namaAlat.setText(data.getNamaPeralatan());
        holder.fungsi.setText(data.getFungsi());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemPowerClickCallback.onItemClicked(list.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class DataViewHolder extends RecyclerView.ViewHolder {

        TextView namaAlat, fungsi;
        ImageView photo;


        public DataViewHolder(@NonNull View itemView) {
            super(itemView);
            namaAlat = itemView.findViewById(R.id.nama_alat);
            fungsi = itemView.findViewById(R.id.fungsi_alat);
            photo = itemView.findViewById(R.id.photoId);
        }
    }
}
