package com.example.sony.tasksmod3;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.widget.EditText;




public class ActivityThree extends Activity{


    EditText Text;

    SharedPreferences sPref;

    final String sText = "saved_text";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        Text = (EditText) findViewById(R.id.Text);
        loadText();
    }


    void saveText() {
        sPref = getPreferences(MODE_PRIVATE);
        Editor editor = sPref.edit();
        editor.putString(sText, Text.getText().toString());
        editor.commit();
    }

    void loadText() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(sText, "");
        Text.setText(savedText);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        saveText();
    }
}