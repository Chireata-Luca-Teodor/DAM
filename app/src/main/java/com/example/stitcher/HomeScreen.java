package com.example.stitcher;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HomeScreen extends AppCompatActivity {

    private Button btnCreate;
    private Button btnSignIn;
    private final int HomeScreenRequest = 100;
    private TextView etEmailSign;
    private TextView etPasswordSign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etEmailSign = (findViewById(R.id.etEmailSign));
        etPasswordSign = (findViewById(R.id.etPasswordSign));
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
                Intent intent = new Intent(HomeScreen.this, SignInScreen.class);
                startActivityForResult(intent,HomeScreenRequest);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == HomeScreenRequest){
            if(resultCode== RESULT_OK){
                if(data!=null){
                    Bundle newBundle = data.getBundleExtra("BundleAnswer");
                    User user = (User) newBundle.getSerializable("user");
                    etEmailSign.setText(user.getEmail());
                    etPasswordSign.setText(user.getPassword());
                }
            }
        }
    }
}