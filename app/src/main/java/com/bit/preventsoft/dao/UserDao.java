package com.bit.preventsoft.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.bit.preventsoft.models.User;

@Dao
public interface UserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertUser(User user);

    @Update
    void updateUser(User user);

    @Delete
    void deleteUser(User user);

    @Query("SELECT * FROM User WHERE email= (:email) AND password= (:password)")
        User loginUser(String email, String password);

   // @Query("INSERT INTO User (email,superuser,password) VALUES (:email,1,:password)")
   //     User registerFirstUser(String email, String password);
}
