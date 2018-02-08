package com.example.sony.tasksmod3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class ActivityFour extends Activity {

    TextView tvView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);

        tvView = (TextView) findViewById(R.id.tvView);

        Intent intent = getIntent();

        String words = intent.getStringExtra("words");

        tvView.setText(words);
    }
}