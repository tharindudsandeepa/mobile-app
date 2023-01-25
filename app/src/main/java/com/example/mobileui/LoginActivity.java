package com.example.mobileui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
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

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mail=email.getText().toString();
                String pass=password.getText().toString();

                Database db=new Database(getApplicationContext(),"mobile",null,1);
                if(mail.length()==0||pass.length()==0){
                    Toast.makeText(getApplicationContext(),"Please fill all details",Toast.LENGTH_SHORT).show();
                }
                else{
                    if(db.login(mail,pass)){
                        Toast.makeText(getApplicationContext(),"Login Success",Toast.LENGTH_SHORT).show();

                        SharedPreferences sharedpreferences=getSharedPreferences("shared_prefs", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor=sharedpreferences.edit();
                        editor.putString("email",mail);
                        editor.apply();
                        Intent i=new Intent(LoginActivity.this,profileActivity.class);
                        startActivity(i);
                    }
                    else{
                        Toast.makeText(getApplicationContext(),"Invalid email or password",Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
    }
}