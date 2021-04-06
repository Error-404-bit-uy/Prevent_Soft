package com.bit.preventsoft.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Update;

import com.bit.preventsoft.models.Apr;

@Dao
public interface AprDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertApr(Apr apr);

    @Update
    void updateApr(Apr apr);

    @Delete
    void deleteApr(Apr apr);


}
