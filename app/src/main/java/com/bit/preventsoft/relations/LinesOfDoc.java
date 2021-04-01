package com.bit.preventsoft.relations;

import androidx.room.Embedded;
import androidx.room.Relation;

import com.bit.preventsoft.models.Apr;
import com.bit.preventsoft.models.User;

import java.util.List;

public class LinesOfDoc {
    @Embedded
    public Apr apr;
    @Relation(
            parentColumn = "aprId",
            entityColumn = "docId"
    )
    public List<Apr> documents;


}
