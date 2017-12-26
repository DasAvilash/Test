package com.example.avilashdas.servicesdemoapplication;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button start, stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = (Button) findViewById(R.id.button_start);
        stop = (Button) findViewById(R.id.button_stop);

        start.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (v == start) {
                    startService(new Intent(MainActivity.this, NewService.class));
                }
            }

        } );

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopService(new Intent(MainActivity.this, NewService.class));
            }
        });
    }
}
