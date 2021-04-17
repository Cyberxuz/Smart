package com.example.smartshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Integer> integerArrayList;
    ArrayList<String > stringArrayList;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        recyclerView=findViewById(R.id.recyclerview1);

        integerArrayList=new ArrayList<>();
        stringArrayList=new ArrayList<>();

        integerArrayList.add(R.drawable.fastfood);
        integerArrayList.add(R.drawable.soda);
        integerArrayList.add(R.drawable.vegitirian);
        stringArrayList.add("Fast Food");
        stringArrayList.add("Soda");
        stringArrayList.add("Vegeterian");

        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

       recyclerView.setLayoutManager(layoutManager);
        myAdapter=new MyAdapter(MainActivity3.this,integerArrayList,stringArrayList);
        recyclerView.setAdapter(myAdapter);




    }
}