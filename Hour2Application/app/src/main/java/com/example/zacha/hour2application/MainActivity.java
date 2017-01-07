package com.example.zacha.hour2application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.net.Uri;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //button for secondary activity
        Button activityButton = (Button) findViewById(R.id.button);
            activityButton.setOnClickListener(new View.OnClickListener(){
            @Override
                public void onClick(View view){
                    Intent startIntent = new Intent(getApplicationContext(), SecondaryActivity.class);
                    startIntent.putExtra("com.example.zacha.hour2application.MESSAGE", "Hello SecondaryActivity");
                    startActivity(startIntent);
            }
        });
        //button for map use
        Button mapButton =  (Button) findViewById(R.id.button2) ;
        mapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String geoURI = "geo:37.422,-122.084?z=23";
                Uri geo = Uri.parse(geoURI);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, geo);
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }
        });
        //button to launch webpage
        Button webButton = (Button) findViewById(R.id.button3);
        webButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                String webURI = "http://www.google.com";
                Uri web = Uri.parse(webURI);
                Intent webIntent = new Intent(Intent.ACTION_VIEW, web);
                if (webIntent.resolveActivity(getPackageManager()) !=null){
                    startActivity(webIntent);
                }
            }
        });

        //button to do a phone call
        Button phoneNumber = (Button) findViewById(R.id.button4);
        phoneNumber.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String phoneNumber = "7245167201";
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + phoneNumber));
                if(intent.resolveActivity(getPackageManager()) != null){
                    startActivity(intent);
                }
            }
        });
    }


}
