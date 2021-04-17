package com.example.smartshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity2 extends AppCompatActivity {

    TextInputEditText textInputEditText1,textInputEditText2,textInputEditText3,textInputEditText4,textInputEditText5;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//pzds
        button=findViewById(R.id.buttonregister);
        textInputEditText1=findViewById(R.id.edittext11);
        textInputEditText2=findViewById(R.id.edittext22);
        textInputEditText3=findViewById(R.id.edittext33);
        textInputEditText4=findViewById(R.id.edittext44);
        textInputEditText5=findViewById(R.id.edittext55);
    }
}