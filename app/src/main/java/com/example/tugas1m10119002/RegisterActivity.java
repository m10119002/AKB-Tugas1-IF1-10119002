package com.example.tugas1m10119002;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void closeMe(View view) {
        finish();
    }

    public void submitMe(View view) {
        finish();
        Toast.makeText(this, "Berhasil mendaftar!", Toast.LENGTH_SHORT).show();
    }
}