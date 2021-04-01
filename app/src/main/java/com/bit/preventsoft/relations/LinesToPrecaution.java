package com.bit.preventsoft.relations;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import com.bit.preventsoft.models.AprLine;
import com.bit.preventsoft.models.Precaution;

import java.util.List;

public class LinesToPrecaution {
    @Embedded
    public AprLine aprLines;
    @Relation(
            parentColumn = "aprLineId",
            entityColumn = "precautionId",
            associateBy = @Junction(LinesWithPrecaution.class)
    )
    public List<Precaution> precautions;
}
