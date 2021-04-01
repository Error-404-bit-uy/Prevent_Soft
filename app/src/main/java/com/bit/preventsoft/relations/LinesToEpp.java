package com.bit.preventsoft.relations;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import com.bit.preventsoft.models.AprLine;
import com.bit.preventsoft.models.Epp;

import java.util.List;

public class LinesToEpp {
    @Embedded
    public AprLine aprLines;
    @Relation(
            parentColumn = "aprLineId",
            entityColumn = "eppId",
            associateBy = @Junction(LinesWithEpp.class)
    )
    public List<Epp> epps;
}
