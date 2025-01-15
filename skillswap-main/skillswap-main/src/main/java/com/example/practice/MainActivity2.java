package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity2 extends AppCompatActivity {
    EditText et1,et2,et3;
    String selectedProficiency;

    DatabaseReference dr ;
//    String email = AppData.email;
//    System.out.println(email);

//    Toast.makeText(MainActivity2.this, email, Toast.LENGTH_SHORT).show();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Spinner proficiencySpinner = findViewById(R.id.proficiencySpinner);
        String[] proficiencyLevels = {"Proficiency","1", "2", "3", "4", "5"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, proficiencyLevels);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        proficiencySpinner.setAdapter(adapter);

        et1=findViewById(R.id.skill);
        et2 = findViewById(R.id.des);
        et3 = findViewById(R.id.email);

        dr = FirebaseDatabase.getInstance().getReference().child("skills");
        Intent intent = getIntent();
//        email = intent.getStringExtra("email");



        proficiencySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedProficiency = proficiencyLevels[position];
                // Handle selection
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Handle case where nothing is selected
            }
        });
    }

    public void mvdashboard(View view) {
        Intent intent3 = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(intent3);
    }

    public void addDB(View view) {
        String name = et1.getText().toString();
        String des = et2.getText(). toString();
        String email = et3.getText(). toString();
        HelperClass1 hc = new HelperClass1(email,name,selectedProficiency,des);
        dr.push().setValue(hc);
        Toast.makeText(this, "Skill Added", Toast.LENGTH_SHORT).show();
        Intent intent3 = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(intent3);

    }
}