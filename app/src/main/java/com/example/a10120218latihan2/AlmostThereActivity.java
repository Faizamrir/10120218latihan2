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

public class AlmostThereActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost_there);
        Button veri = (Button) findViewById(R.id.button3);
        veri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AlmostThereActivity.this, com.example.a10120218latihan2.VerifyActivity.class);
                startActivity(intent);
            }
        });
    }
}
