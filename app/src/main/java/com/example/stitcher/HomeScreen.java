package com.example.stitcher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeScreen extends AppCompatActivity {

    private Button btnCreate;
    private Button btnSignIn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCreate = findViewById(R.id.btnCreate);
        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomeScreen.this,"Create new account!", Toast.LENGTH_LONG).show();
                Intent newWindow = new Intent(HomeScreen.this, RegisterScreen.class);
                startActivity(newWindow);
            }
        });
        btnSignIn = findViewById(R.id.btnSignIn);
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomeScreen.this,"Login succesfull!", Toast.LENGTH_LONG).show();
                Intent newWindow = new Intent(HomeScreen.this, RegisterScreen.class);
                startActivity(newWindow);
            }
        });

    }


}