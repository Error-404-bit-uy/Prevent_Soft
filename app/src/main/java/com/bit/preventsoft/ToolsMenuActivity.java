package com.bit.preventsoft;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ToolsMenuActivity extends AppCompatActivity {

    Button newToolBtn, editToolBtn, stockToolBtn;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tools_menu);
        String email = getIntent().getStringExtra("name");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        newToolBtn = findViewById(R.id.btn_new_tool);
        editToolBtn = findViewById(R.id.btn_edit_tool);
        stockToolBtn = findViewById(R.id.btn_tools_stock);

        newToolBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {

                        startActivity(new Intent(
                                ToolsMenuActivity.this, NewToolActivity.class)
                                .putExtra("name", email));
                    }
                }).start();
            }
        });
        editToolBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {

                        startActivity(new Intent(
                                ToolsMenuActivity.this, EditToolActivity.class)
                                .putExtra("name", email));
                    }
                }).start();
            }
        });
        stockToolBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {

                        startActivity(new Intent(
                                ToolsMenuActivity.this, StockToolActivity.class)
                                .putExtra("name", email));
                    }
                }).start();
            }
        });
    }
}