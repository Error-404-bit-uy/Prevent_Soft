package com.bit.preventsoft.models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Precaution")
public class Precaution {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    public int precautionId;
    @NonNull
    public String name;

    public Precaution() {
    }

    public Precaution(int precautionId, @NonNull String name) {
        this.precautionId = precautionId;
        this.name = name;
    }

    public int getPrecautionId() {
        return precautionId;
    }

    public void setPrecautionId(int precautionId) {
        this.precautionId = precautionId;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }
}
