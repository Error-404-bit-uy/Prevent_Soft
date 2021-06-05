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

    public int image;

    public Tool() {
    }



    public Tool(@NonNull String name, int image) {

        this.name = name;
        this.image = image;
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
    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
