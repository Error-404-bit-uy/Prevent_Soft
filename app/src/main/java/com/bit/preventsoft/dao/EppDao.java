package com.bit.preventsoft.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Update;

import com.bit.preventsoft.models.Epp;

@Dao
public interface EppDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertEpp(Epp epp);

    @Update
    void updateEpp(Epp epp);

    @Delete
    void deleteEpp(Epp epp);
}
