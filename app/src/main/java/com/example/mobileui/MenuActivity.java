package com.example.mobileui;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    TextView congratulation,compose,insights,imageSlide,menuback;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        congratulation=findViewById(R.id.congratulation);
        compose=findViewById(R.id.compose);
        insights=findViewById(R.id.insights);
        imageSlide=findViewById(R.id.imageSlider);
        menuback=findViewById(R.id.menuback);

        congratulation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MenuActivity.this,CongratulationActivity.class);
                startActivity(i);
            }
        });
        compose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j=new Intent(MenuActivity.this,Compose.class);
                startActivity(j);
            }
        });
        insights.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(MenuActivity.this,insight.class);
                startActivity(in);
            }
        });

        imageSlide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MenuActivity.this,imageSlider.class);
                startActivity(i);
            }
        });
        menuback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MenuActivity.this,LoginActivity.class);
                startActivity(i);

            }
        });



    }
}