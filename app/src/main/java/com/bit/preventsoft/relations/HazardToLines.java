package com.bit.preventsoft.relations;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import com.bit.preventsoft.models.AprLine;
import com.bit.preventsoft.models.Hazard;

import java.util.List;

public class HazardToLines {
    @Embedded
    public Hazard hazards;
    @Relation(
            parentColumn = "hazardId",
            entityColumn = "aprLineId",
            associateBy = @Junction(LinesWithHazard.class)
    )
    public List<AprLine> aprLines;
}
