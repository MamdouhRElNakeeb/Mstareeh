package com.ibrandcity.mstareeh.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ibrandcity.mstareeh.R;

public class Splash extends AppCompatActivity {

    private static final long SPLASH_TIME_OUT = 2000 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(new Intent(Splash.this, Register.class));
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
