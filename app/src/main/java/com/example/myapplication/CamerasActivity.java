package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class CamerasActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cameras);

        Button back = findViewById(R.id.btnBack);

        back.setOnClickListener(v -> finish());
    }
}