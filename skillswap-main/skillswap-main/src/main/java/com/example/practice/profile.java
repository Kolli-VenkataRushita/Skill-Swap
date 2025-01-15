package com.example.practice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class profile extends AppCompatActivity {

    TextView profileName;
    TextView profileUsername;
    TextView profileEmail;
    Button logoutButton;
    private FirebaseAuth mAuth;
    private DatabaseReference userRef;

    String nameuser ;
    String useremail;
    String usernameuser ;
    String passworduser ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

//        // Initialize Firebase components
//        mAuth = FirebaseAuth.getInstance();
//        FirebaseUser currentUser = mAuth.getCurrentUser();

        // Initialize layout elements
        profileName = findViewById(R.id.profile_name);
        profileUsername = findViewById(R.id.profile_username);
        profileEmail = findViewById(R.id.profile_email);
        logoutButton = findViewById(R.id.logout_button);

        Intent intent = getIntent();
        nameuser = intent.getStringExtra("nameuser");
        useremail = intent.getStringExtra("useremail");
        usernameuser = intent.getStringExtra("usernameuser");
        passworduser = intent.getStringExtra("passworduser");

//        Toast.makeText(this, nameuser + useremail, Toast.LENGTH_SHORT).show();

        profileName.setText("Name: " + nameuser);
        profileUsername.setText("Username: " + usernameuser); // Display the username
        profileEmail.setText("Email: " + useremail);

        // Check if user is logged in
//        if (currentUser != null) {
//            String currentUserUsername = currentUser.getEmail(); // Assuming email is used as username
//            retrieveUserData(currentUserUsername); // Use the logic to retrieve user details
//        } else {
//            Toast.makeText(this, "User not logged in", Toast.LENGTH_SHORT).show();
//        }

        // Logout button functionality
        logoutButton.setOnClickListener(this::onClick);
    }

//    private void retrieveUserData(String userUsername) {
//        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("Users");
//        Query checkUserDatabase = reference.orderByChild("username").equalTo(userUsername);
//
//        checkUserDatabase.addListenerForSingleValueEvent(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot snapshot) {
//                if (snapshot.exists()) {
//                    // Assuming the username is unique, we can get the first matching user
//                    DataSnapshot userSnapshot = snapshot.getChildren().iterator().next();
//
////                    String name = userSnapshot.child("name").getValue(String.class);
////                    String email = userSnapshot.child("email").getValue(String.class);
//
//                    // Set data to TextViews
//                    profileName.setText("Name: " + nameuser);
//                    profileUsername.setText("Username: " + userUsername); // Display the username
//                    profileEmail.setText("Email: " + useremail);
//                } else {
//                    Toast.makeText(profile.this, "User data not found!", Toast.LENGTH_SHORT).show();
//                }
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError error) {
//                Toast.makeText(profile.this, "Error retrieving data", Toast.LENGTH_SHORT).show();
//            }
//        });
//    }

    private void onClick(View v) {
        startActivity(new Intent(profile.this, MainActivity.class));
        finish();
    }
}
