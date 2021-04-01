package com.bit.preventsoft.relations;

import androidx.room.Entity;

@Entity(primaryKeys = {"aprLineId", "precautionId"})
public class LinesWithPrecaution {
    public int aprLineId;
    public int precautionId;
}
