package com.bit.preventsoft;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.bit.preventsoft.dao.AprDao;
import com.bit.preventsoft.dao.AprLineDao;
import com.bit.preventsoft.dao.UserDao;
import com.bit.preventsoft.database.PreventSoftDatabase;
import com.bit.preventsoft.models.Apr;
import com.bit.preventsoft.models.AprLine;
import com.bit.preventsoft.models.User;

public class NewFormActivity extends AppCompatActivity {

    EditText docName, docComments, docActivities;
    Spinner docStatus;
    Button confirmBtn;


    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_form);
        String email = getIntent().getStringExtra("name");
        docName = findViewById(R.id.document_name);
        docComments = findViewById(R.id.editTextTextMultiLine);
        docActivities = findViewById(R.id.doc_lines_activities_text);
        docStatus = findViewById(R.id.new_form_status_selector);
        confirmBtn = findViewById(R.id.btn_save);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        Apr apr = new Apr();
        AprLine aprLine = new AprLine();

        confirmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new Thread(new Runnable() {
                    @Override
                    public void run() {

                        String nameDoc = docName.getText().toString();
                        String commentsDoc = docComments.getText().toString();
                        String activitiesDoc = docActivities.getText().toString();
                        String statusDoc = docStatus.getSelectedItem().toString();
                        if(nameDoc.isEmpty() || commentsDoc.isEmpty()
                                || activitiesDoc.isEmpty() || statusDoc.isEmpty()){
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    Toast.makeText(getApplicationContext(), "Complete todos los campos", Toast.LENGTH_LONG).show();
                                }
                            });
                        } else {
                            PreventSoftDatabase preventSoftDatabase = PreventSoftDatabase.getDatabase(getApplicationContext());
                            AprDao aprDao = preventSoftDatabase.aprDao();
                            AprLineDao aprLineDao = preventSoftDatabase.aprLineDao();


                            new Thread(new Runnable() {
                                @Override
                                public void run() {

                                    apr.setTitle(nameDoc);
                                    apr.setCreatedAt(System.currentTimeMillis());
                                    apr.setComments(commentsDoc);
                                    apr.setCreatorId(email);
                                    apr.setStatus(statusDoc);

                                    aprDao.insertApr(apr);


                                    if(apr.getTitle() == null){
                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {
                                                Toast.makeText(getApplicationContext(), "Ocurrió un error. No se guardó el documento!", Toast.LENGTH_LONG).show();
                                            }
                                        });
                                    } else {
                                        int id = apr.getAprId();
                                        aprLine.setActivities(activitiesDoc);
                                        aprLine.setDocId(id);

                                        aprLineDao.insertAprLine(aprLine);
                                        if(aprLine.getActivities() == null){
                                            runOnUiThread(new Runnable() {
                                                @Override
                                                public void run() {
                                                    Toast.makeText(getApplicationContext(), "Ocurrió un error. No se guardaron las líneas del documento!", Toast.LENGTH_LONG).show();
                                                }
                                            });
                                        }else{
                                            runOnUiThread(new Runnable() {
                                                @Override
                                                public void run() {
                                                    Toast.makeText(getApplicationContext(), "Se guardaron el documento y sus líneas!", Toast.LENGTH_LONG).show();
                                                }
                                            });

                                        }

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