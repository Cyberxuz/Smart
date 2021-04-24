package com.example.smartshop;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    TextInputEditText textInputEditText1,textInputEditText2;
    Button button;

    FirebaseAuth firebaseAuth;

    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button1);
        textInputEditText1=findViewById(R.id.edittext1);
        textInputEditText2=findViewById(R.id.edittext2);

        firebaseAuth=FirebaseAuth.getInstance();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firebaseAuth.signInWithEmailAndPassword(textInputEditText1.getText().toString(),textInputEditText2.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if (task.isSuccessful()){
//                            sharedPreferences=getPreferences(MODE_PRIVATE);
//                            SharedPreferences.Editor editor=sharedPreferences.edit();
//                            editor.putString("oktam",textInputEditText1.getText().toString());
                            //editor.commit();
                            startActivity(new Intent(MainActivity.this,MainActivity3.class));

                        }else {
                            Toast.makeText(MainActivity.this, "Kuda ketasan", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });

    }

    public void registerr(View view) {
        startActivity(new Intent(MainActivity.this,MainActivity2.class));
    }
}