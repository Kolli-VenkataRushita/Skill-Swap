package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
    }

    public void details(View view) {
        Intent intent1 = new Intent(MainActivity6.this, MainActivity7.class);
        startActivity(intent1);
    }

    public void mvdashboard(View view) {
        Intent intent1 = new Intent(MainActivity6.this, MainActivity.class);
        startActivity(intent1);
    }
}