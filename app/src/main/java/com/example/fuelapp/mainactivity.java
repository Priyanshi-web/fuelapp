package com.example.fuelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.fuelapp.Driver;
import com.example.fuelapp.Login;
import com.example.fuelapp.R;

public class mainactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void driver(View view) {
        Intent a1 = new Intent(this, Driver.class);
        startActivity(a1);
        finish();
    }

    public void admin(View view) {
        Intent a2 = new Intent(this, Login.class);
        startActivity(a2);
        finish();
    }
}