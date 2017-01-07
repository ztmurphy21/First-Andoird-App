package com.example.zacha.hour2application;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.content.Intent;



public class SecondaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
        String message = "no data from Intent";
        Intent intent = getIntent();
        if (intent != null) {
            message = intent.getStringExtra("com.example.zacha.hour2application.MESSAGE");
        } else if (intent.hasExtra(Intent.EXTRA_TEXT)) {
            message = intent.getStringExtra(Intent.EXTRA_TEXT);
        }
        TextView messageTextView = (TextView) findViewById(R.id.message);
        messageTextView.setText(message);


    }
}
