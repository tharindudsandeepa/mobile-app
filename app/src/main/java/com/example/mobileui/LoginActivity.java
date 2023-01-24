package com.example.mobileui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class LoginActivity extends AppCompatActivity {

    EditText email,password;
    Button loginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email=findViewById(R.id.email);
        password=findViewById(R.id.password);


        loginButton =findViewById(R.id.loginBtn);

        loginButton.setOnClickListener(view -> {
            if(email.getText().toString().equals("admin@gmail.com")&&password.getText().toString().equals("admin")){
                Toast.makeText(LoginActivity.this,"LOGIN SUCCESSFULLY",Toast.LENGTH_SHORT).show();
                Intent i=new Intent(LoginActivity.this,profileActivity.class);
                startActivity(i);
            }
            else{
                Toast.makeText(LoginActivity.this,"Login Failed",Toast.LENGTH_SHORT).show();
            }
        });



    }
}