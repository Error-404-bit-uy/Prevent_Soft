package com.bit.preventsoft;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class NewFormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_form);
        String email = getIntent().getStringExtra("name");
    }
}