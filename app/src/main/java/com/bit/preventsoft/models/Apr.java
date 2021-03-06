package com.bit.preventsoft.models;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity(tableName = "Document")
public class Apr {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    public int aprId;
    @NonNull
    public String title;
    @NonNull
    public long createdAt;
    @NonNull

    public String comments;
    @NonNull
    public String creatorId;
    public String status;

    public Apr() {
    }

    public Apr(@NonNull String title, long createdAt, String comments, String creatorId, String status) {
        this.title = title;
        this.createdAt = createdAt;
        this.comments = comments;
        this.creatorId = creatorId;
        this.status = status;
    }

    public int getAprId() {
        return aprId;
    }

    public void setAprId(int aprId) {
        this.aprId = aprId;
    }

    @NonNull
    public String getTitle() {
        return title;
    }

    public void setTitle(@NonNull String title) {
        this.title = title;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
