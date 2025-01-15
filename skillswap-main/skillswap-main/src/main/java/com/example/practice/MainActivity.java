package com.example.practice;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    String email;
    TextView profilename, profilemail, profileusername, profilepassword;

    String nameuser ;
    String useremail;
    String usernameuser ;
    String passworduser ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        profilename = findViewById(R.id.profile_name);
//        profilemail = findViewById(R.id.profile_email);
//        profileusername = findViewById(R.id.profile_username);
//        profilepassword = findViewById(R.id.login_password);

        Intent intent = getIntent();
        nameuser = intent.getStringExtra("name");
        useremail = intent.getStringExtra("email");
        usernameuser = intent.getStringExtra("username");
        passworduser = intent.getStringExtra("password");

//        Toast.makeText(this, nameuser + useremail, Toast.LENGTH_SHORT).show();

//        email = intent.getStringExtra("email");
//        if (email == null) {
//            Toast.makeText(this, "Email is missing!", Toast.LENGTH_SHORT).show();
//        }
    }

    public void learn(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity5.class);
        startActivity(intent);
    }

    public void addskill(View view) {
        Intent intent1 = new Intent(MainActivity.this, MainActivity2.class);
//        if (email == null) {
//            Toast.makeText(this, "Email is missing!", Toast.LENGTH_SHORT).show();
//        }
        intent1.putExtra("email",email);
        startActivity(intent1);
    }

    public void logout(View view) {
        Intent intent1 = new Intent(MainActivity.this, MainActivity4.class);

        startActivity(intent1);
    }

    public void myskills(View view) {
        Intent intent1 = new Intent(MainActivity.this, MainActivity6.class);
        startActivity(intent1);
    }



    public void profile(View view) {
        Intent intent9 = new Intent(MainActivity.this, profile.class);
        intent9.putExtra("nameuser", nameuser);
        intent9.putExtra("useremail", useremail);
        intent9.putExtra("usernameuser", usernameuser);
        intent9.putExtra("passworduser", passworduser);

        startActivity(intent9);
    }
}