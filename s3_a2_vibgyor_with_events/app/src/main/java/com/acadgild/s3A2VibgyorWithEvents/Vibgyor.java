package com.acadgild.s3A2VibgyorWithEvents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Vibgyor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vibgyor);
    }

    public void clickColorBand(View v){
        Toast.makeText(this,
                getString(R.string.on_tap_heading) + ((TextView) findViewById(v.getId())).getText(),
                Toast.LENGTH_SHORT)
                .show();
        Log.d(getString(R.string.on_user_action),
                getString(R.string.on_tap_heading) + ((TextView) findViewById(v.getId())).getText());
    }
}