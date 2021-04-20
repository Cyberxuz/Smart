package com.example.smartshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity4 extends AppCompatActivity {

    RecyclerView recyclerView;


    ArrayList<String > arrayListzakaz;
    ArrayList<Integer > arrayListzakazimage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        recyclerView=findViewById(R.id.recyclerview3);
        Intent intent=getIntent();
        arrayListzakazimage=intent.getIntegerArrayListExtra("oktam2");

       arrayListzakaz= (ArrayList<String>) intent.getSerializableExtra("oktam");

        MyAdapter3 myAdapter3=new MyAdapter3(this,arrayListzakazimage,arrayListzakaz);


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myAdapter3);

    }
}