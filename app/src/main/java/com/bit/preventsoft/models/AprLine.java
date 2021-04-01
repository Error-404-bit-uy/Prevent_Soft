package com.bit.preventsoft.models;

import androidx.annotation.NonNull;
import androidx.room.PrimaryKey;

public class AprLine {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    public int aprLineId;
    public String activities;
    public int docId;

    public AprLine() {
    }

    public int getAprLineId() {
        return aprLineId;
    }

    public void setAprLineId(int aprLineId) {
        this.aprLineId = aprLineId;
    }

    public String getActivities() {
        return activities;
    }

    public void setActivities(String activities) {
        this.activities = activities;
    }

    public int getDocId() {
        return docId;
    }

    public void setDocId(int docId) {
        this.docId = docId;
    }
}
