package com.example.a10120218latihan2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

//Faiz Amri Rahman
//10120218
//IF6
//26-04-2023

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        Button register = (Button) findViewById(R.id.button4);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(RegisterActivity.this, com.example.a10120218latihan2.AlmostThereActivity.class);
                startActivity(intent);
            }
        });

    }
}