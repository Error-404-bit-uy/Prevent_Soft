package com.bit.preventsoft.relations;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import com.bit.preventsoft.models.AprLine;
import com.bit.preventsoft.models.Precaution;

import java.util.List;

public class PrecautionToLines {
    @Embedded
    public Precaution precautions;
    @Relation(
            parentColumn = "precautionId",
            entityColumn = "aprLineId",
            associateBy = @Junction(LinesWithPrecaution.class)
    )
    public List<AprLine> aprLines;
}
