package com.example.hellotoast;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class VersionAdapter extends RecyclerView.Adapter<ItemViewHolder> {

    private ArrayList<String> versionNameList = new ArrayList<>();
    private ArrayList<String> colors = new ArrayList<>();


    public void setVersionNameList(ArrayList<String> list){
        colors.add("#f44336");
        colors.add("#e91e63");
        colors.add("#9c27b0");
        colors.add("#2196f3");
        colors.add("#009688");
        colors.add("#4caf50");
        colors.add("#cddc39");
        colors.add("#ffeb3b");
        colors.add("#FF9800");


        this.versionNameList.addAll(list);
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);

        ItemViewHolder holder = new ItemViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {

       String versionName = this.versionNameList.get(position);
       holder.changeText(versionName);
       String color = this.colors.get(position);
       holder.changeBackgroundColor(color);

    }

    @Override
    public int getItemCount() {

        return versionNameList.size();
    }
}
