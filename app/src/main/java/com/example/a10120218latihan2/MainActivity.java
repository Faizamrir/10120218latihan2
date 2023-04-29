package com.example.a10120218latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

//Faiz Amri Rahman
//10120218
//IF6
//26-04-2023

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnRegister(View view){
        Intent intent = new Intent(MainActivity.this, com.example.a10120218latihan2.RegisterActivity.class);
        startActivity(intent);
    }
}