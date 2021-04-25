package com.bit.preventsoft;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FormsMenuActivity extends AppCompatActivity {

    Button newFormBtn, editFormBtn, historicFormBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forms_menu);
        String email = getIntent().getStringExtra("name");

        newFormBtn = findViewById(R.id.btn_new_document);
        editFormBtn = findViewById(R.id.btn_edit_document);
        historicFormBtn = findViewById(R.id.btn_form_history);

        newFormBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {

                        startActivity(new Intent(
                                FormsMenuActivity.this, NewFormActivity.class)
                                .putExtra("name", email));
                    }
                }).start();
            }
        });
        editFormBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {

                        startActivity(new Intent(
                                FormsMenuActivity.this, EditFormActivity.class)
                                .putExtra("name", email));
                    }
                }).start();
            }
        });
        historicFormBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {

                        startActivity(new Intent(
                                FormsMenuActivity.this, FormsListActivity.class)
                                .putExtra("name", email));
                    }
                }).start();
            }
        });
    }
}