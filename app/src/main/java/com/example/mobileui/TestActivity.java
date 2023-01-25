package com.example.mobileui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class TestActivity extends AppCompatActivity {

    TextView login;
    EditText userName,password,email;
    Button signBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        login=findViewById(R.id.textView4);
        userName=findViewById(R.id.regUsername);
        password=findViewById(R.id.regPassword);
        email=findViewById(R.id.regEmail);
        signBtn=findViewById(R.id.signBtn);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(TestActivity.this,LoginActivity.class);
                startActivity(i);
            }
        });

        signBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username=userName.getText().toString();
                String pass=password.getText().toString();
                String mail=email.getText().toString();
                Database db=new Database(getApplicationContext(),"mobile",null,1);
                if(username.length()==0||mail.length()==0||pass.length()==0){

                    Toast.makeText(getApplicationContext(),"Please fill all details",Toast.LENGTH_SHORT).show();
                }
                else{
                    if(isValid(pass)){
                        db.register(username, mail, pass);
                        Toast.makeText(getApplicationContext(),"Registered Successfully.",Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(TestActivity.this,LoginActivity.class));
                    }
                    else{
                        Toast.makeText(getApplicationContext(),"Password must contain atleast 6 Characters with atleast a digit and a letter", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    public static boolean isValid(String checkPassword){
        int f1=0,f2=0;
        if(checkPassword.length()<6){
            return false;
        }
        else {
            for(int p=0;p<checkPassword.length();p++){
                if(Character.isLetter(checkPassword.charAt(p))){
                    f1=1;
                }
            }
            for(int r=0;r<checkPassword.length();r++){
                if(Character.isDigit(checkPassword.charAt(r))){
                    f2=1;
                }
            }

            if(f1==1 && f2==1){
                return true;
            }
            return false;
        }
    }
}