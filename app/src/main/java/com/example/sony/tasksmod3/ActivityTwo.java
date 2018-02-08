package com.example.sony.tasksmod3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityTwo extends Activity implements View.OnClickListener {

    EditText Words;

    Button Click;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        Words = (EditText) findViewById(R.id.words);


        Click = (Button) findViewById(R.id.click);
        Click.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, ActivityFour.class);
        intent.putExtra("words", Words.getText().toString());

        startActivity(intent);
    }
}
