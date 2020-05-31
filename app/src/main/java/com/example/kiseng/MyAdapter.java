package com.example.kiseng;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {


    private ArrayList<String> translations;
    private Context context;


    MyAdapter(ArrayList<String> words, Context context) {
        this.translations = words;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(this.context);

        View view = inflater.inflate(R.layout.translation, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.getDisplay_area().setText(translations.get(position));
    }

    @Override
    public int getItemCount() { return translations.size(); }
}
