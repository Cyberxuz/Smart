package com.example.smartshop;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter2 extends RecyclerView.Adapter<MyAdapter2.MyViewHolder> {

    Context context;
    ArrayList<Integer> integerArrayList;
    ArrayList<String > stringArrayList;
    int a=0;

    ArrayList<String> zakazarraylistname;
    ArrayList<Integer> zakazarraylistimage;

    public MyAdapter2(Context context, ArrayList<Integer> integerArrayList, ArrayList<String> stringArrayList) {
        this.context = context;
        this.integerArrayList = integerArrayList;
        this.stringArrayList = stringArrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.recyclerviewproducts,parent,false);


        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.textView.setText(stringArrayList.get(position).toString());
        holder.imageView.setImageResource(integerArrayList.get(position));
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder=new AlertDialog.Builder(context);
                View view=LayoutInflater.from(context).inflate(R.layout.dialogg,null);
                builder.setView(view);
                builder.setTitle("About");
                builder.setMessage(stringArrayList.get(position).toString());
                ImageView imageViewd=view.findViewById(R.id.imageviewdialog1);
                imageViewd.setImageResource(integerArrayList.get(position));
                builder.create();
                builder.show();
            }
        });

        zakazarraylistimage=new ArrayList<>();
        zakazarraylistname=new ArrayList<>();
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MainActivity3 mainActivity3= (MainActivity3) v.getContext();
                mainActivity3.textView.setVisibility(View.VISIBLE);
                a++;
                mainActivity3.textView.setText(a+"");
                zakazarraylistname.add(stringArrayList.get(position));
                zakazarraylistimage.add(integerArrayList.get(position));
                mainActivity3.imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(context,MainActivity4.class);
                        intent.putExtra("oktam",zakazarraylistname);
                        intent.putExtra("oktam2",zakazarraylistimage);


                        context.startActivity(intent);
                    }
                });
                Toast.makeText(context, "ishlidi axir", Toast.LENGTH_SHORT).show();
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
        Button button;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.textviewproductnameeeeee);
            imageView=itemView.findViewById(R.id.imageviewproduct2);

            button=itemView.findViewById(R.id.buttonorder);

        }
    }
}
