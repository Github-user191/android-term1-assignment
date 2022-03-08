package com.example.muhammedluqmaandevspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MenuScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_screen);
        TextView menuWelcomeTextView = (TextView) findViewById(R.id.menuWelcomeTextView);

        if(getIntent().hasExtra("visitorName")) {
            TextView menuTitleTextView = (TextView) findViewById(R.id.menuTitleTextView);
            String visitorName = getIntent().getExtras().getString("visitorName");
            menuTitleTextView.setText("Dear " + visitorName);
        }


        Button menuHomeBtn = (Button) findViewById(R.id.menuHomeBtn);
        menuHomeBtn.setOnClickListener((View v) -> {
            Intent goToLauncherActivity = new Intent(getApplicationContext(), LauncherScreen.class);
            startActivity(goToLauncherActivity);
        });

        Button menuCalculationBtn = (Button) findViewById(R.id.menuCalculationBtn);
        menuCalculationBtn.setOnClickListener((View v) -> {
            Intent goToCalculatorActivity = new Intent(getApplicationContext(), CalculationScreen.class);
            startActivity(goToCalculatorActivity);
        });

        Button menuAboutMeBtn = (Button) findViewById(R.id.menuAboutMeBtn);
        menuAboutMeBtn.setOnClickListener((View v) -> {
            Intent goToAboutMeActivity = new Intent(getApplicationContext(), AboutMeScreen.class);
            startActivity(goToAboutMeActivity);
        });

        Button menuMyDevProfileBtn = (Button) findViewById(R.id.menuMyDevProfileBtn);
        menuMyDevProfileBtn.setOnClickListener((View v) -> {
            Intent goToMyDevProfileActivity = new Intent(getApplicationContext(), MyDevProfileScreen.class);
            startActivity(goToMyDevProfileActivity);
        });






    }
}