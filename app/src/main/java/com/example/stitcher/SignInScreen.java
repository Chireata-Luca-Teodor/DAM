package com.example.stitcher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignInScreen extends AppCompatActivity {

    private Button btnSignScreen;
    private EditText etEmailSign;
    private EditText etPasswordSign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_screen);

        btnSignScreen = findViewById(R.id.btnSignScreen);
        btnSignScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        Toast.makeText(SignInScreen.this, "Login Succesfull!", Toast.LENGTH_LONG).show();
                        Intent newWindow = new Intent(SignInScreen.this, AppScreen.class);
                        startActivity(newWindow);
            }
        });
    }
}