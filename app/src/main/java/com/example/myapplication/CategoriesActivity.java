package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;

public class CategoriesActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        Button back = findViewById(R.id.btnBack);
        Button cars = findViewById(R.id.btnCars);
        Button mobiles = findViewById(R.id.btnMobiles);
        Button cameras = findViewById(R.id.btnCameras);
        Button laptops = findViewById(R.id.btnLaptops);

        back.setOnClickListener(v -> finish());

        cars.setOnClickListener(v ->
                openPage(CarsActivity.class));

        mobiles.setOnClickListener(v ->
                openPage(MobilesActivity.class));

        cameras.setOnClickListener(v ->
                openPage(CamerasActivity.class));

        laptops.setOnClickListener(v ->
                openPage(LaptopsActivity.class));
    }

    private void openPage(Class<?> page) {
        startActivity(new Intent(this, page));
    }
}