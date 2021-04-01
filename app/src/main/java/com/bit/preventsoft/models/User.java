package com.bit.preventsoft.models;

import androidx.annotation.NonNull;
import androidx.room.PrimaryKey;

public class User {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    public int UserId;
    @NonNull
    public String email;
    @NonNull
    public boolean superUser;
    @NonNull
    public String password;

    public User() {
    }

    public User(int userId, @NonNull String email, boolean superUser, @NonNull String password) {
        UserId = userId;
        this.email = email;
        this.superUser = superUser;
        this.password = password;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    @NonNull
    public String getEmail() {
        return email;
    }

    public void setEmail(@NonNull String email) {
        this.email = email;
    }

    public boolean isSuperUser() {
        return superUser;
    }

    public void setSuperUser(boolean superUser) {
        this.superUser = superUser;
    }

    @NonNull
    public String getPassword() {
        return password;
    }

    public void setPassword(@NonNull String password) {
        this.password = password;
    }
}
