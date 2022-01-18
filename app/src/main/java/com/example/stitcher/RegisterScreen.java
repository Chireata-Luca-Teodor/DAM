package com.example.stitcher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterScreen extends AppCompatActivity {

    private Button btnRegister;
    private EditText etEmailReg;
    private EditText etPasswordReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnRegister = findViewById(R.id.btnRegister);
        etEmailReg = findViewById(R.id.etEmailReg);
        etPasswordReg = findViewById(R.id.etPasswordReg);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isValid()) {
                    User u1 = new User();
                    u1.setEmail(etEmailReg.getText().toString());
                    u1.setPassword(etPasswordReg.getText().toString());
                    Toast.makeText(RegisterScreen.this, u1.toString(), Toast.LENGTH_SHORT).show();
                    Bundle wrapper = new Bundle();
                    wrapper.putSerializable("user",u1);
                    Intent intent = new Intent();
                    intent.putExtra("BundleAnswer", wrapper);
                    setResult(RESULT_OK,intent);
                    finish();
                }
            }
        });
    }

    private boolean isValid(){
        if (etEmailReg.getText().toString().isEmpty())
        {
            Toast.makeText(RegisterScreen.this, "Complete the email box!", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (!(isEmailValid(etEmailReg.getText().toString())))
        {
            Toast.makeText(RegisterScreen.this, "Invalid email!", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (etPasswordReg.getText().toString().isEmpty())
        {
            Toast.makeText(RegisterScreen.this, "Complete the password box!", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    boolean isEmailValid(CharSequence email) {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }
}