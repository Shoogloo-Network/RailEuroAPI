package com.controller.helper.places;

public class Location {
Double	lat;
Double	lon;

public Double getLat() {
	return lat;
}

public void setLat(Double lat) {
	this.lat = lat;
}

public Double getLon() {
	return lon;
}

public void setLon(Double lon) {
	this.lon = lon;
}

@Override
public String toString() {
	return "Location [lat=" + lat + ", lon=" + lon + "]";
}

}
