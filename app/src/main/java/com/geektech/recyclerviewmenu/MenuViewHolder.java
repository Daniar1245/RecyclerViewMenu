package com.geektech.recyclerviewmenu;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MenuViewHolder extends RecyclerView.ViewHolder {
    private TextView menuTV;
    public MenuViewHolder(@NonNull View itemView) {
        super(itemView);
        menuTV = itemView.findViewById(R.id.TextViewMenu);
    }
    public void bind (String menu){menuTV.setText(menu);
    }
}
