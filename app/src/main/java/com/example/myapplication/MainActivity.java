package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button browse = findViewById(R.id.btnBrowse);
        Button cars = findViewById(R.id.btnCars);
        Button mobiles = findViewById(R.id.btnMobiles);
        Button cameras = findViewById(R.id.btnCameras);
        Button laptops = findViewById(R.id.btnLaptops);

        EditText search = findViewById(R.id.searchBox);

        browse.setOnClickListener(v ->
                openPage(CategoriesActivity.class));

        cars.setOnClickListener(v ->
                openPage(CarsActivity.class));

        mobiles.setOnClickListener(v ->
                openPage(MobilesActivity.class));

        cameras.setOnClickListener(v ->
                openPage(CamerasActivity.class));

        laptops.setOnClickListener(v ->
                openPage(LaptopsActivity.class));

        search.setOnEditorActionListener((v, actionId, event) -> {
            String query = search.getText().toString()
                    .trim().toLowerCase();

            if (query.contains("car")) {
                openPage(CarsActivity.class);
            } else if (query.contains("mobile")
                    || query.contains("phone")) {
                openPage(MobilesActivity.class);
            } else if (query.contains("camera")) {
                openPage(CamerasActivity.class);
            } else if (query.contains("laptop")) {
                openPage(LaptopsActivity.class);
            } else if (query.isEmpty()) {
                openPage(CategoriesActivity.class);
            } else {
                Toast.makeText(this,
                        "Search cars, mobiles, cameras or laptops",
                        Toast.LENGTH_SHORT).show();
            }

            return true;
        });
    }

    private void openPage(Class<?> page) {
        Intent intent = new Intent(MainActivity.this, page);
        startActivity(intent);
    }
}