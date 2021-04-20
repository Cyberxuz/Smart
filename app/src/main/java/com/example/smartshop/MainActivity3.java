package com.example.smartshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Integer> integerArrayList;
    ArrayList<String > stringArrayList;
    MyAdapter myAdapter;
    RecyclerView recyclerView2;
    ArrayList<Integer> integerArrayList2;
    ArrayList<String > stringArrayList2;
    MyAdapter2 myAdapter2;
    ImageView imageView;
    TextView textView;

    DrawerLayout drawerLayout;
    ImageView imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        recyclerView=findViewById(R.id.recyclerview1);
        recyclerView2=findViewById(R.id.recyclerview2);

        drawerLayout=findViewById(R.id.drawerlayout);

        imageView1=findViewById(R.id.drawermenu);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(Gravity.LEFT);
            }
        });


        textView=findViewById(R.id.textviewprice);
        imageView=findViewById(R.id.backet);

        textView.setVisibility(View.INVISIBLE);

        integerArrayList=new ArrayList<>();
        stringArrayList=new ArrayList<>();

        integerArrayList.add(R.drawable.fastfood);
        integerArrayList.add(R.drawable.soda);
        integerArrayList.add(R.drawable.vegitirian);
        stringArrayList.add("Fast Food");
        stringArrayList.add("Soda");
        stringArrayList.add("Vegeterian");
        integerArrayList2=new ArrayList<>();
        stringArrayList2=new ArrayList<>();

        integerArrayList2.add(R.drawable.rasm1);
        integerArrayList2.add(R.drawable.rasm2);
        integerArrayList2.add(R.drawable.rasm3);
        integerArrayList2.add(R.drawable.rasm4);
        stringArrayList2.add("Fast Food");
        stringArrayList2.add("Soda");
        stringArrayList2.add("Vegeterian");
        stringArrayList2.add("Bir vaj");


        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

       recyclerView.setLayoutManager(layoutManager);
        myAdapter=new MyAdapter(MainActivity3.this,integerArrayList,stringArrayList);
        recyclerView.setAdapter(myAdapter);



        recyclerView2.setHasFixedSize(true);

        recyclerView2.setLayoutManager(new LinearLayoutManager(MainActivity3.this));
        myAdapter2=new MyAdapter2(MainActivity3.this,integerArrayList2,stringArrayList2);
        recyclerView2.setAdapter(myAdapter2);





    }
}