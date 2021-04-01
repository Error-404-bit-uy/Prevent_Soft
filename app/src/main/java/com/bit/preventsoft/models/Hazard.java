package com.bit.preventsoft.models;

import androidx.annotation.NonNull;
import androidx.room.PrimaryKey;

public class Hazard {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    public int hazardId;
    @NonNull
    public String name;

    public Hazard() {
    }

    public Hazard(int hazardId, @NonNull String name) {
        this.hazardId = hazardId;
        this.name = name;
    }

    public int getHazardId() {
        return hazardId;
    }

    public void setHazardId(int hazardId) {
        this.hazardId = hazardId;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }
}
