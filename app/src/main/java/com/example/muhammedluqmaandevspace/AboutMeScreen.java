package com.example.muhammedluqmaandevspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AboutMeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me_screen);

        Button aboutMeBackBtn = (Button) findViewById(R.id.aboutMeBackBtn);

        String visitorName = getIntent().getStringExtra("visitorName");


        aboutMeBackBtn.setOnClickListener((View v) -> {
            onBackPressed();
        });
    }
}