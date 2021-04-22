package com.example.smartshop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

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
        DatabaseReference databaseReference;
        databaseReference= FirebaseDatabase.getInstance().getReference().child("Buyurtmalar");


        holder.textView.setText(stringArrayList.get(position).toString());
        holder.imageView.setImageResource(integerArrayList.get(position));
        holder.numberPicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity4 mainActivity4= (MainActivity4) v.getContext();
                mainActivity4.button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Zakaz zakaz=new Zakaz();
                        zakaz.setNomi(stringArrayList.toString());
                        zakaz.setSoni(holder.numberPicker.getValue()+"");
                        databaseReference.push().setValue(zakaz);
                        Toast.makeText(context, "Buyurtma berildi", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });

    }

    @Override
    public int getItemCount() {
        return integerArrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;
        NumberPicker numberPicker;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.textviewzakaz1);
            imageView=itemView.findViewById(R.id.imageviewzakaz1);
            numberPicker=itemView.findViewById(R.id.numberpicker);
            numberPicker.setMaxValue(30);
            numberPicker.setMinValue(1);
            numberPicker.setValue(1);



        }
    }
}
