package com.ftqq.pushdeer;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO register message poll timer

    }

    private void onTimerTrigger() {
        // TODO poll message via HTTP

    }
}