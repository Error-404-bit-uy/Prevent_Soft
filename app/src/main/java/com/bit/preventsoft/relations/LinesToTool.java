package com.bit.preventsoft.relations;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import com.bit.preventsoft.models.AprLine;
import com.bit.preventsoft.models.Tool;

import java.util.List;

public class LinesToTool {
    @Embedded
    public AprLine aprLines;
    @Relation(
            parentColumn = "aprLineId",
            entityColumn = "toolId",
            associateBy = @Junction(LinesWithTool.class)
    )
    public List<Tool> tools;
}
