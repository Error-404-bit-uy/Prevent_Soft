package com.bit.preventsoft.relations;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import com.bit.preventsoft.models.AprLine;
import com.bit.preventsoft.models.Hazard;

import java.util.List;

public class LinesToHazard {
    @Embedded
    public AprLine aprLines;
    @Relation(
            parentColumn = "aprLineId",
            entityColumn = "hazardId",
            associateBy = @Junction(LinesWithHazard.class)
    )
    public List<Hazard> hazards;
}
