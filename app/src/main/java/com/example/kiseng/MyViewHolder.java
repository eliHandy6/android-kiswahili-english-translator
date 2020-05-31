package com.example.kiseng;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
class MyViewHolder extends RecyclerView.ViewHolder {

    private TextView display_area;
    MyViewHolder(@NonNull View itemView) {
        super(itemView);

        display_area = itemView.findViewById(R.id.translated);
    }

    TextView getDisplay_area() {
        return display_area;
    }
}
