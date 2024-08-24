package com.controller.helper.booking;

import java.util.List;

import com.controller.helper.ResourceError;

public class LegSolution {
	String id;
	String providerId;
	String departure;
	String arrival;
	String duration;
	List<Segment> segments;
	List<SegmentConnection> segmentConnections;
	List<ResourceError> errors;
	List<ResourceError> warnings;
	Place origin;
	Place destination;
	TravelerInformationRequired travelerInformationRequired;
	
	@Override
	public String toString() {
		return "LegSolution [id=" + id + ", providerId=" + providerId + ", departure=" + departure + ", arrival="
				+ arrival + ", duration=" + duration + ", segments=" + segments + ", segmentConnections="
				+ segmentConnections + ", errors=" + errors + ", warnings=" + warnings + ", origin=" + origin
				+ ", destination=" + destination + ", travelerInformationRequired=" + travelerInformationRequired + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProviderId() {
		return providerId;
	}
	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public List<Segment> getSegments() {
		return segments;
	}
	public void setSegments(List<Segment> segments) {
		this.segments = segments;
	}
	public List<SegmentConnection> getSegmentConnections() {
		return segmentConnections;
	}
	public void setSegmentConnections(List<SegmentConnection> segmentConnections) {
		this.segmentConnections = segmentConnections;
	}
	public List<ResourceError> getErrors() {
		return errors;
	}
	public void setErrors(List<ResourceError> errors) {
		this.errors = errors;
	}
	public List<ResourceError> getWarnings() {
		return warnings;
	}
	public void setWarnings(List<ResourceError> warnings) {
		this.warnings = warnings;
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
	public TravelerInformationRequired getTravelerInformationRequired() {
		return travelerInformationRequired;
	}
	public void setTravelerInformationRequired(TravelerInformationRequired travelerInformationRequired) {
		this.travelerInformationRequired = travelerInformationRequired;
	}

}
