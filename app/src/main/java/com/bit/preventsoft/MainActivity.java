package com.bit.preventsoft;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.bit.preventsoft.dao.UserDao;
import com.bit.preventsoft.database.PreventSoftDatabase;
import com.bit.preventsoft.models.User;

public class MainActivity extends AppCompatActivity {

    //User Name Input
       EditText usrLoginText;
    //Password Input
       EditText passLoginText;
    //Login button
       Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usrLoginText = (EditText)findViewById(R.id.login_usr);
        passLoginText = (EditText)findViewById(R.id.login_pass);
        loginBtn = (Button)findViewById(R.id.loginBtn);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new Thread(new Runnable() {
                    @Override
                    public void run() {

                        String userName = usrLoginText.getText().toString();
                        String userPass = passLoginText.getText().toString();
                        if(userName.isEmpty() || userPass.isEmpty()){
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                            Toast.makeText(getApplicationContext(), "Complete todos los campos", Toast.LENGTH_LONG).show();
                                }
                            });
                        } else {
                            PreventSoftDatabase preventSoftDatabase = PreventSoftDatabase.getDatabase(getApplicationContext());
                            UserDao userDao = preventSoftDatabase.userDao();
                            new Thread(new Runnable() {
                                @Override
                                    public void run() {
                                        User user = userDao.loginUser(userName, userPass);
                                        if(user == null){
                                            runOnUiThread(new Runnable() {
                                                @Override
                                                public void run() {
                                                    Toast.makeText(getApplicationContext(), "Verifique los datos ingresados!", Toast.LENGTH_LONG).show();
                                                }
                                            });
                                        } else {
                                            String name = user.email;
                                            startActivity(new Intent(
                                                MainActivity.this, HomeActivity.class)
                                                .putExtra("name", name));
                                        }
                                    }
                            }).start();
                        }
                    }
                }).start();
            }
        });
    }
}