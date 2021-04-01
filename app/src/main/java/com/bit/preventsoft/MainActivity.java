package com.bit.preventsoft;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //We initialize the inputs, texts
    //Title text view
    private TextView loginTitle = (TextView)findViewById(R.id.login_title);
    //User Name Input
    private EditText usrLoginText = (EditText)findViewById(R.id.login_usr);
    //Password Input
    private EditText passLoginText = (EditText)findViewById(R.id.login_pass);
    //Login button
    private Button loginBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginBtn = (Button)findViewById(R.id.loginBtn);
    }


    
}