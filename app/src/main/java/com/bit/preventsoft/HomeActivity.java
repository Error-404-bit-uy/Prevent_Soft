package com.bit.preventsoft;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    TextView name;
    Button formsBtn, recomendationsBtn, preventionBtn, toolsBtn, usersBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        name = findViewById(R.id.textViewName);
        formsBtn = findViewById(R.id.btn_forms);
        recomendationsBtn = findViewById(R.id.btn_recomendations);
        preventionBtn = findViewById(R.id.btn_prevention);
        toolsBtn = findViewById(R.id.btn_tools);
        //usersBtn = findViewById(R.id.btn_users);

        String email = getIntent().getStringExtra("name");
        name.setText(email);
        formsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {

                        startActivity(new Intent(
                                HomeActivity.this, FormsMenuActivity.class)
                                .putExtra("name", email));
                    }
                }).start();
            }
        });
        recomendationsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {

                        startActivity(new Intent(
                                HomeActivity.this, RecomendationsActivity.class)
                                .putExtra("name", email));
                    }
                }).start();
               
            }
        });
        preventionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {

                        startActivity(new Intent(
                                HomeActivity.this, PreventionsActivity.class)
                                .putExtra("name", email));
                    }
                }).start();
            }
        });
        toolsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {

                        startActivity(new Intent(
                                HomeActivity.this, ToolsMenuActivity.class)
                                .putExtra("name", email));
                    }
                }).start();
            }
        });

    }
}