package com.bit.preventsoft.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.bit.preventsoft.models.Tool;

import java.util.List;


@Dao
public interface ToolDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertTool(Tool tool);

    @Update
    void updateTool(Tool tool);

    @Delete
    void deleteTool(Tool tool);

    @Query("SELECT * FROM Tool")
    public List<Tool> allTools();


}
