package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class MainActivity5 extends AppCompatActivity {
    ListView userdata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }

    public void mvdashboard1(View view) {
        Intent intent1 = new Intent(MainActivity5.this, MainActivity.class);
        startActivity(intent1);
    }

    public void show(View view) {
        Intent intent1 = new Intent(MainActivity5.this, MainActivity7.class);
        startActivity(intent1);
    }
}