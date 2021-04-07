package com.bit.preventsoft.models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Tool")
public class Tool {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    public int toolId;
    @NonNull
    public String name;

    public Tool() {
    }

    public Tool(int toolId, @NonNull String name) {
        this.toolId = toolId;
        this.name = name;
    }

    public int getToolId() {
        return toolId;
    }

    public void setToolId(int toolId) {
        this.toolId = toolId;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }
}
