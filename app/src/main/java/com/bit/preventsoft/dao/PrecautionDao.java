package com.bit.preventsoft.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Update;

import com.bit.preventsoft.models.Precaution;

@Dao
public interface PrecautionDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertPrecaution(Precaution precaution);

    @Update
    void updatePrecaution(Precaution precaution);

    @Delete
    void deletePrecaution(Precaution precaution);
}
