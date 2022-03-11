package com.example.muhammedluqmaandevspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MyDevProfileScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_dev_profile_screen);

        Button myDevProfileBackBtn = (Button) findViewById(R.id.myDevProfileBackBtn);
        TextView myDevProfileLinkedInTextView = (TextView) findViewById(R.id.myDevProfileLinkedInTextView);


        myDevProfileBackBtn.setOnClickListener((View v) -> {
            Intent goToMenuActivity = new Intent(MyDevProfileScreen.this, MenuScreen.class);
            startActivity(goToMenuActivity);
        });



//        myDevProfileLinkedInTextView.setClickable(true);
        myDevProfileLinkedInTextView.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<font color=#000><a href='http://www.google.com'> LinkedIn </a></font>";
        Spannable spannedText = (Spannable) Html.fromHtml(text);

        myDevProfileLinkedInTextView.setText(Html.fromHtml(text));
    }
}