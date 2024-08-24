package com.controller.helper.pointoffer;

public class Leg {
	Place origin;

	Place destination;
	String departure;
	Boolean directOnly;
	LegSolution solutions;
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
	public Boolean getDirectOnly() {
		return directOnly;
	}
	public void setDirectOnly(Boolean directOnly) {
		this.directOnly = directOnly;
	}
	public LegSolution getSolutions() {
		return solutions;
	}
	public void setSolutions(LegSolution solutions) {
		this.solutions = solutions;
	}
	@Override
	public String toString() {
		return "Leg [departure=" + departure + ", directOnly=" + directOnly + "]";
	}
	
}
