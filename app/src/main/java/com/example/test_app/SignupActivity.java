package com.example.test_app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_signup);


        EditText email =findViewById(R.id.et_signup_email);
        EditText pass =findViewById(R.id.et_signup_password);
        EditText phone =findViewById(R.id.et_signup_phone);
        EditText date =findViewById(R.id.et_signup_date_naiss);

        Button signup = findViewById(R.id.bnt_signup);
        Button cancel = findViewById(R.id.btn_cancel);

        signup.setOnClickListener(v -> {
            Toast.makeText(this,"A signup request was sent to the server",Toast.LENGTH_SHORT).show();
        });

        cancel.setOnClickListener(v -> {
            Intent intent = new Intent(SignupActivity.this,MainActivity.class);
            startActivity(intent);
        });
    }
}