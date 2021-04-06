package com.bit.preventsoft.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Update;

import com.bit.preventsoft.models.Hazard;

@Dao
public interface HazardDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertHazard(Hazard hazard);

    @Update
    void updateHazard(Hazard hazard);

    @Delete
    void deleteHazard(Hazard hazard);
}
