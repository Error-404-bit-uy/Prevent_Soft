package com.bit.preventsoft.relations;

import androidx.room.Entity;

import java.util.List;

@Entity(primaryKeys = {"aprLineId", "eppId"})
public class LinesWithEpp {
    public int aprLineId;
    public int eppId;


}

