package com.bit.preventsoft.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Update;

import com.bit.preventsoft.models.Tool;

@Dao
public interface ToolDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertTool(Tool tool);

    @Update
    void updateTool(Tool tool);

    @Delete
    void deleteTool(Tool tool);

}
