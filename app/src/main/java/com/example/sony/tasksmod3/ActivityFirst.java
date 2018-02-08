package com.example.sony.tasksmod3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActivityFirst extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new GameView(this));
    }
}
