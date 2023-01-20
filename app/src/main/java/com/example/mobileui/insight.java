package com.example.mobileui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class insight extends AppCompatActivity {
    ProgressBar progress;
    TextView text,insightBack;
    int value=70;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insight);
        progress=findViewById(R.id.progress);
        text=findViewById(R.id.progress_text);
        insightBack=findViewById(R.id.insightback);
        update();

        insightBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(insight.this,profileActivity.class);
                startActivity(i);
            }
        });
    }
    public void update(){
        progress.setProgress(value);
        text.setText(value+"% Spent");
    }

}