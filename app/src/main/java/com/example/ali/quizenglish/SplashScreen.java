package com.example.ali.quizenglish;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

/**
 * Created by Naim on 23.08.2015.
 */
public class SplashScreen extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        Thread thread = new Thread() {

            @Override
            public void run() {

                try {
                    synchronized (this) {
                        wait(3000);
                    }
                } catch (InterruptedException e) {

                } finally {

                    finish();

                    Intent intent = new Intent();
                    intent.setClass(getApplicationContext(), AnaSayfa.class);
                    startActivity(intent);

                }

            }
        };

        thread.start();

    }
}
