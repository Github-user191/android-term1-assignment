package com.example.muhammedluqmaandevspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // hide top action bar on splash screen
        getSupportActionBar().hide();

        // redirect to Launcher screen after 3 seconds
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent goToMenuActivity = new Intent(MainActivity.this, LauncherScreen.class);
                startActivity(goToMenuActivity);
            }
        }, 3000);
    }
}