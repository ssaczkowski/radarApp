package com.ses.pc.radarapp;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Location {

@SerializedName("latitude")
@Expose
private double latitude;
@SerializedName("longitude")
@Expose
private double longitude;

/**
* No args constructor for use in serialization
*
*/
public Location() {
}

/**
*
* @param longitude
* @param latitude
*/
public Location(double latitude, double longitude) {
super();
this.latitude = latitude;
this.longitude = longitude;
}

public double getLatitude() {
return latitude;
}

public void setLatitude(double latitude) {
this.latitude = latitude;
}

public double getLongitude() {
return longitude;
}

public void setLongitude(double longitude) {
this.longitude = longitude;
}



}
