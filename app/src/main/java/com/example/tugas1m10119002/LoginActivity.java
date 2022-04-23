package com.example.tugas1m10119002;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    Intent register_intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        register_intent = new Intent(LoginActivity.this, RegisterActivity.class);
    }

    public void openRegisterActivity(View view) {
        startActivity(register_intent);
    }

    public void openMainActivity(View view) {
        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
        Toast.makeText(this, "Berhasil masuk!", Toast.LENGTH_SHORT).show();
    }
}