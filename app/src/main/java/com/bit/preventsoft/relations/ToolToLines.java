package com.bit.preventsoft.relations;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import com.bit.preventsoft.models.AprLine;
import com.bit.preventsoft.models.Tool;

import java.util.List;

public class ToolToLines {
    @Embedded
    public Tool tools;
    @Relation(
            parentColumn = "toolId",
            entityColumn = "aprLineId",
            associateBy = @Junction(LinesWithTool.class)
    )
    public List<AprLine> aprLines;
}
