package com.example.tugas1m10119002;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Intent profile_intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        profile_intent = new Intent(MainActivity.this, ProfileActivity.class);
    }

    public void openProfileActivity(View view) {
        startActivity(profile_intent);
    }

    public void logoutMe(View view) {
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(intent);
        finish();
        Toast.makeText(this, "Berhasil keluar!", Toast.LENGTH_SHORT).show();
    }
}