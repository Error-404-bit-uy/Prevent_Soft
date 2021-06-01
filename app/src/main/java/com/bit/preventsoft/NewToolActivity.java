package com.bit.preventsoft;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.bit.preventsoft.dao.AprDao;
import com.bit.preventsoft.dao.AprLineDao;
import com.bit.preventsoft.dao.ToolDao;
import com.bit.preventsoft.database.PreventSoftDatabase;
import com.bit.preventsoft.models.Tool;

public class NewToolActivity extends AppCompatActivity {

    EditText toolName;
    ImageButton imageTool;
    Button saveTool;
    Tool tool = new Tool();

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_tool);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    toolName = findViewById(R.id.new_tool_name);
    imageTool = findViewById(R.id.upload_img_btn);
    saveTool = findViewById(R.id.save_new_tool_btn);
        // tool.setImageUrl(imageTool.get);
    saveTool.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {


            tool.setName(toolName.getText().toString());
            if(tool.getName() == null){
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(getApplicationContext(), "Complete los campos", Toast.LENGTH_LONG).show();
                    }
                });

            } else {
                PreventSoftDatabase preventSoftDatabase = PreventSoftDatabase.getDatabase(getApplicationContext());
                ToolDao toolDao = preventSoftDatabase.toolDao();
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        tool.setName(toolName.toString());
                        toolDao.insertTool(tool);
                        if(tool.getName() == null){
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    Toast.makeText(getApplicationContext(), "No se guardaron los datos!", Toast.LENGTH_LONG).show();
                                }
                            });

                        }else {
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    Toast.makeText(getApplicationContext(), "Se gurdaron correctamente los datos!!", Toast.LENGTH_LONG).show();
                                }
                            });
                        }
                    }
                }).start();



            }



        }
    });

    }
}