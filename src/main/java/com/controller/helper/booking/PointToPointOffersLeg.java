package com.controller.helper.booking;

import java.util.List;

public class PointToPointOffersLeg {
	Place origin;
	Place destination;
	String departure;
	List<LegSolution>solutions;
	Boolean directOnly;
	@Override
	public String toString() {
		return "PointToPointOffersLeg [origin=" + origin + ", destination=" + destination + ", departure=" + departure
				+ ", solutions=" + solutions + ", directOnly=" + directOnly + "]";
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
	public List<LegSolution> getSolutions() {
		return solutions;
	}
	public void setSolutions(List<LegSolution> solutions) {
		this.solutions = solutions;
	}
	public Boolean getDirectOnly() {
		return directOnly;
	}
	public void setDirectOnly(Boolean directOnly) {
		this.directOnly = directOnly;
	}
	
}
