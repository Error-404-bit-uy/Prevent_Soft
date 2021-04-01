package com.bit.preventsoft.models;

import androidx.annotation.NonNull;
import androidx.room.PrimaryKey;

public class Epp {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    public int eppId;
    @NonNull
    public String name;
    public int stock;
    public String imageUrl;

    public Epp() {
    }

    public Epp(int eppId, @NonNull String name, int stock, String imageUrl) {
        this.eppId = eppId;
        this.name = name;
        this.stock = stock;
        this.imageUrl = imageUrl;
    }

    public int getEppId() {
        return eppId;
    }

    public void setEppId(int eppId) {
        this.eppId = eppId;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
