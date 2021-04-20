package com.bit.preventsoft;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.bit.preventsoft.dao.UserDao;
import com.bit.preventsoft.database.PreventSoftDatabase;
import com.bit.preventsoft.models.User;

public class MainActivity extends AppCompatActivity {

    //We initialize the inputs, texts
    //Title text view
    // private TextView loginTitle = (TextView)findViewById(R.id.login_title);
    //User Name Input
    // private EditText usrLoginText = (EditText)findViewById(R.id.login_usr);
    //Password Input
    // private EditText passLoginText = (EditText)findViewById(R.id.login_pass);
    //Login button
    private Button loginBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginBtn = (Button)findViewById(R.id.loginBtn);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PreventSoftDatabase preventSoftDatabase = PreventSoftDatabase.getDatabase(getApplicationContext());
                UserDao userDao = preventSoftDatabase.userDao();
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        User user = new User();
                        user.setEmail("email@email.com");
                        user.setPassword("password");
                        userDao.insertUser(user);
                       // if (user == null) {
                       //     runOnUiThread(new Runnable() {
                       //         @Override
                       //         public void run() {
                        //            Toast.makeText(getApplicationContext(), "Ocurrió un error", Toast.LENGTH_LONG).show();
                        //        }
                        //    });
                       // } else {
                         //   runOnUiThread(new Runnable() {
                           //     @Override
                             //   public void run() {
                                    Toast.makeText(getApplicationContext(), "Primer usuario creado", Toast.LENGTH_LONG).show();
                               // }
                           // });
                       // }
                    }
                }).start();

            }
        });



    }
}