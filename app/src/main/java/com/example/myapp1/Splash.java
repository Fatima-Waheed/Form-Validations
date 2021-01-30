package com.example.myapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        final Intent intent = new Intent(Splash.this , MainActivity.class);
        Handler handler=new Handler();
        Runnable runnable= new Runnable() {
            @Override
            public void run() {
                startActivity(intent);
                finish();
            }
        };
        handler.postDelayed(runnable, 3000);

    }
}
