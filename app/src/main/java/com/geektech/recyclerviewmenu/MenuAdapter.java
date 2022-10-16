package com.geektech.recyclerviewmenu;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MenuAdapter extends RecyclerView.Adapter<MenuViewHolder> {
    private ArrayList<String> MenuList;
    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MenuViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_menu, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MenuViewHolder holder, int position) {
        holder.bind(MenuList.get(position));
    }

    @Override
    public int getItemCount() {
        return MenuList.size();
    }
}
