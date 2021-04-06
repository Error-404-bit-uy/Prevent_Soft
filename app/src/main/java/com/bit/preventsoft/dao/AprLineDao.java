package com.bit.preventsoft.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Update;

import com.bit.preventsoft.models.AprLine;

@Dao
public interface AprLineDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAprLine(AprLine aprLine);

    @Update
    void updateAprLine(AprLine aprLine);

    @Delete
    void deleteAprLine(AprLine aprLine);
}
