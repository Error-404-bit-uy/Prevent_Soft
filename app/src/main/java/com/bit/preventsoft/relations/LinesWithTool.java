package com.bit.preventsoft.relations;

import androidx.room.Entity;

@Entity(primaryKeys = {"aprLineId", "toolId"})
public class LinesWithTool {
    public int aprLineId;
    public int toolId;
}
