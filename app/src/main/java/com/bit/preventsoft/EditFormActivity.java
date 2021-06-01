package com.bit.preventsoft;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

public class EditFormActivity extends AppCompatActivity {

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_form);
        String email = getIntent().getStringExtra("name");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }
}