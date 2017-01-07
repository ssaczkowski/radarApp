package com.ses.pc.radarapp;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Item {

@SerializedName("location")
@Expose
private Location location;
@SerializedName("radius")
@Expose
private int radius;
@SerializedName("code")
@Expose
private String code;
@SerializedName("radiusInMeter")
@Expose
private int radiusInMeter;
@SerializedName("kind")
@Expose
private String kind;

/**
* No args constructor for use in serialization
*
*/
public Item() {
}

/**
*
* @param radiusInMeter
* @param location
* @param radius
* @param code
* @param kind
*/
public Item(Location location, int radius, String code, int radiusInMeter, String kind) {
super();
this.location = location;
this.radius = radius;
this.code = code;
this.radiusInMeter = radiusInMeter;
this.kind = kind;
}

public Location getLocation() {
return location;
}

public void setLocation(Location location) {
this.location = location;
}

public int getRadius() {
return radius;
}

public void setRadius(int radius) {
this.radius = radius;
}

public String getCode() {
return code;
}

public void setCode(String code) {
this.code = code;
}

public int getRadiusInMeter() {
return radiusInMeter;
}

public void setRadiusInMeter(int radiusInMeter) {
this.radiusInMeter = radiusInMeter;
}

public String getKind() {
return kind;
}

public void setKind(String kind) {
this.kind = kind;
}



}
