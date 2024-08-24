package com.controller.helper.pointoffer;

public class LegRequest {
	Place origin;
	Place destination;
	String departure;
	boolean directOnly;

	@Override
	public String toString() {
		return "LegRequest [origin=" + origin + ", destination=" + destination + ", departure=" + departure
				+ ", directOnly=" + directOnly + "]";
	}

	public Place getOrigin() {
		return origin;
	}

	public void setOrigin(Place origin) {
		this.origin = origin;
	}

	public Place getDestination() {
		return destination;
	}

	public void setDestination(Place destination) {
		this.destination = destination;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public boolean isDirectOnly() {
		return directOnly;
	}

	public void setDirectOnly(boolean directOnly) {
		this.directOnly = directOnly;
	}
	
	
}
