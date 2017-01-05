package com.ses.pc.radarapp;

import com.google.gson.annotations.SerializedName;
import  com.ses.pc.radarapp.Location;

import java.io.Serializable;


public class Item implements Serializable {
    @SerializedName("location")
    private Location location;
    @SerializedName("radius")
    private Double radius;
    @SerializedName("code")
    private String code;
    @SerializedName("radiusInMeter")
    private Double radiusInMeter;
    @SerializedName("kind")
    private String kind;

    public Item(){

    }

    public Item(Location location, Double radius, String code, Double radiusInMeter, String kind) {
        this.location = location;
        this.radius = radius;
        this.code = code;
        this.radiusInMeter = radiusInMeter;
        this.kind = kind;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setRadiusInMeter(Double radiusInMeter) {
        this.radiusInMeter = radiusInMeter;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Location getLocation() {
        return location;
    }

    public Double getRadius() {
        return radius;
    }

    public String getCode() {
        return code;
    }

    public Double getRadiusInMeter() {
        return radiusInMeter;
    }

    public String getKind() {
        return kind;
    }
}
