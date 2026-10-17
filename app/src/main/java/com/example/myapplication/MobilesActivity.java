package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class MobilesActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobiles);

        Button back = findViewById(R.id.btnBack);

        back.setOnClickListener(v -> finish());
    }
}