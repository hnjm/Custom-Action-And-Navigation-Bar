package com.example.customnavandactionbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import static java.lang.Thread.sleep;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(2000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();

    }
}