package com.example.zacha.hour2application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button activityButton = (Button) findViewById(R.id.button);
            activityButton.setOnClickListener(new View.OnClickListener(){
            @Override
                public void onClick(View view){
                    Intent startIntent = new Intent(getApplicationContext(), SecondaryActivity.class);
                    startActivity(startIntent);
            }
        });
    }
}
