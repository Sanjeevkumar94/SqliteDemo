package com.example.sqlitedemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    ArrayList<UserInfo> list;

    public ItemAdapter(ArrayList<UserInfo> list){
        this.list = list;

    }

    @NonNull
    @Override
    public ItemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.item_view, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemAdapter.ViewHolder holder, int position) {

        holder.tvId.setText(list.get(position).getId());
        holder.tvName.setText(list.get(position).getName());
        holder.tvMobile.setText(list.get(position).getMobile());
        holder.tvEmail.setText(list.get(position).getEmail());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView tvId,tvName,tvMobile,tvEmail;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.tvId = itemView.findViewById(R.id.tv_id);
            this.tvName = itemView.findViewById(R.id.tv_name);
            this.tvMobile = itemView.findViewById(R.id.tv_mobile);
            this.tvEmail = itemView.findViewById(R.id.tv_tv_email);
        }
    }
}
