package com.example.msvs2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class user extends AppCompatActivity {
    Button eventbtn, resultbtn, profilebtn, logoutbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        eventbtn=findViewById(R.id.eventbtn);
        resultbtn=findViewById(R.id.resultbtn);
        profilebtn=findViewById(R.id.profilebtn);
        logoutbtn=findViewById(R.id.logoutbtn);

        eventbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(user.this,votingevents.class);
                startActivity(intent);
            }
        });

        resultbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(user.this, result.class);
                startActivity(intent);
            }
        });

        profilebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(user.this,myprofile.class);
                startActivity(intent);
            }
        });

        logoutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(user.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
