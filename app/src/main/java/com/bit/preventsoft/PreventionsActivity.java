package com.bit.preventsoft;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PreventionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prevention_screen);
        String email = getIntent().getStringExtra("name");
    }
}