package com.example.smartshop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter3 extends RecyclerView.Adapter<MyAdapter3.MyViewHolder> {

    Context context;
    ArrayList<Integer> integerArrayList;
    ArrayList<String > stringArrayList;

    public MyAdapter3(Context context, ArrayList<Integer> integerArrayList, ArrayList<String> stringArrayList) {
        this.context = context;
        this.integerArrayList = integerArrayList;
        this.stringArrayList = stringArrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.zakazdizayn,parent,false);


        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.textView.setText(stringArrayList.get(position).toString());
        holder.imageView.setImageResource(integerArrayList.get(position));

    }

    @Override
    public int getItemCount() {
        return integerArrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.textviewzakaz1);
            imageView=itemView.findViewById(R.id.imageviewzakaz1);


        }
    }
}
