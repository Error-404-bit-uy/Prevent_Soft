package com.bit.preventsoft.relations;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import com.bit.preventsoft.models.AprLine;
import com.bit.preventsoft.models.Epp;

import java.util.List;

public class EppToLines {
    @Embedded
    public Epp epps;
    @Relation(
            parentColumn = "eppId",
            entityColumn = "aprLineId",
            associateBy = @Junction(LinesWithEpp.class)
    )
    public List<AprLine> aprLines;
}
