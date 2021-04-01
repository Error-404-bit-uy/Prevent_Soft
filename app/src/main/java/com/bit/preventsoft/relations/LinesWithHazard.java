package com.bit.preventsoft.relations;

import androidx.room.Entity;

@Entity(primaryKeys = {"aprLineId", "hazardId"})
public class LinesWithHazard {
    public int aprLineId;
    public int hazardId;
}
