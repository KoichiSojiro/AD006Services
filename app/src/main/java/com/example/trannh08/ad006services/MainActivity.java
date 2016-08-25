package com.example.trannh08.ad006services;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import com.example.trannh08.ad006services.utils.MyService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startMyService(View view) {
        startService(new Intent(getBaseContext(), MyService.class));
    }

    public void stopMyService (View view) {
        stopService(new Intent(getBaseContext(), MyService.class));
    }
}
