package com.example.muhammedluqmaandevspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LauncherScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher_screen);

        Button launcherNextBtn = (Button) findViewById(R.id.launcherNextBtn);
        EditText launcherVisitorNameEditText = (EditText) findViewById(R.id.launcherVisitorNameEditText);


        TextView launcherTitleTextView = (TextView)  findViewById(R.id.launcherTitleTextView);

//        launcherTitleTextView.setText("POGGERS");

//        String visitorName = String.valueOf(launcherVisitorNameEditText.getText());



        launcherNextBtn.setOnClickListener((View v) -> {
            Intent goToMenuActivity = new Intent(getApplicationContext(), MenuScreen.class);
            goToMenuActivity.putExtra("visitorName", launcherVisitorNameEditText.getText().toString());
            startActivity(goToMenuActivity);
        });


    }
}