package com.example.smartshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class MainActivity4 extends AppCompatActivity {

    RecyclerView recyclerView;


    ArrayList<String > arrayListzakaz;
    ArrayList<Integer > arrayListzakazimage;

    Button button;
    DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        button=findViewById(R.id.buttonbuyurtma);
        recyclerView=findViewById(R.id.recyclerview3);
        Intent intent=getIntent();
        arrayListzakazimage=intent.getIntegerArrayListExtra("oktam2");

       arrayListzakaz= (ArrayList<String>) intent.getSerializableExtra("oktam");

        MyAdapter3 myAdapter3=new MyAdapter3(this,arrayListzakazimage,arrayListzakaz);


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myAdapter3);




    }
}