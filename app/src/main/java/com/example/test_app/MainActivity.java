package com.example.test_app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        EditText email =findViewById(R.id.et_email);
        EditText pass =findViewById(R.id.et_password);

        Button btn = findViewById(R.id.btn_connect);

        TextView signup = findViewById(R.id.tv_signup);

        signup.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,SignupActivity.class);
            startActivity(intent);
        });

        btn.setOnClickListener(v -> {
            String user = "test@gmail.com";
            String password = "1234";
            if(email.getText().toString().equals(user)&& pass.getText().toString().equals(password)){

                Intent intent = new Intent(MainActivity.this,WelcomActivity.class);
                startActivity(intent);
            }else {
                Toast.makeText(this,"Wrong password or email", Toast.LENGTH_SHORT).show();
            }


        });
    }
}