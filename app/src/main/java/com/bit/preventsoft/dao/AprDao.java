package com.bit.preventsoft.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.bit.preventsoft.models.Apr;
import com.bit.preventsoft.models.AprLine;

@Dao
public interface AprDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertApr(Apr apr);

    @Update
    void updateApr(Apr apr);

    @Delete
    void deleteApr(Apr apr);

    @Query("INSERT INTO Document (title,createdAt,comments,creatorId,status) VALUES (:title,:createdAt,:comments,:creatorId,:status)")
       void  insert(String title, long createdAt,String comments,String creatorId,String status);


}
