package com.bit.preventsoft;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Toast;

import com.bit.preventsoft.Adapters.ToolAdapter;
import com.bit.preventsoft.dao.ToolDao;
import com.bit.preventsoft.dao.UserDao;
import com.bit.preventsoft.database.PreventSoftDatabase;
import com.bit.preventsoft.models.Tool;
import com.bit.preventsoft.models.User;

import java.util.ArrayList;
import java.util.List;

public class EditToolActivity extends AppCompatActivity {

    private RecyclerView recyclerView_tools_list;
    ArrayList<Tool> tools;
    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_tools);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        recyclerView_tools_list = (RecyclerView) findViewById(R.id.recyclerView_tools_list);
        LinearLayoutManager linear = new LinearLayoutManager(this);
        linear.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView_tools_list.setLayoutManager(linear);
        toolsList();
        initAdapter();


    }
    public void initAdapter(){
        ToolAdapter toolAdapter= new ToolAdapter(tools);
        recyclerView_tools_list.setAdapter(toolAdapter);
    }

    public void toolsList(){
        tools = new ArrayList<Tool>();

//        new Thread(new Runnable() {
//          @Override
//          public void run() {
//              PreventSoftDatabase preventSoftDatabase = PreventSoftDatabase.getDatabase(getApplicationContext());
//              ToolDao toolDao = preventSoftDatabase.toolDao();
//                tools = (ArrayList<Tool>) toolDao.allTools();
//          }
//        }).start();
        tools.add(new Tool("Amoladora",R.drawable.icono_abrir_carpetaxhdpi));
        tools.add(new Tool("Taladro",R.drawable.icono_abrir_carpetaxhdpi));
        tools.add(new Tool("Grùa",R.drawable.icono_abrir_carpetaxhdpi));
        tools.add(new Tool("Escalera",R.drawable.icono_abrir_carpetaxhdpi));
        tools.add(new Tool("Soldadora",R.drawable.icono_abrir_carpetaxhdpi));
        tools.add(new Tool("Pinza",R.drawable.icono_abrir_carpetaxhdpi));
        tools.add(new Tool("Martillo",R.drawable.icono_abrir_carpetaxhdpi));
        tools.add(new Tool("Maceta",R.drawable.icono_abrir_carpetaxhdpi));
        tools.add(new Tool("Pico punta y pala",R.drawable.icono_abrir_carpetaxhdpi));
        tools.add(new Tool("Pala",R.drawable.icono_abrir_carpetaxhdpi));
        tools.add(new Tool("Sierra circular",R.drawable.icono_abrir_carpetaxhdpi));
        tools.add(new Tool("Pinza morza",R.drawable.icono_abrir_carpetaxhdpi));



    }
}