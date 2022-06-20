package com.example.androidsceneform.common.helpers;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.androidsceneform.MainActivityE;
import com.example.androidsceneform.R;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {


                Intent i = new Intent(Splash.this, MainActivityE.class);
                startActivity(i);
                finish();
            }
        }, 5000);
    }

}