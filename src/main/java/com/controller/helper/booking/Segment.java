package com.controller.helper.booking;

import java.util.List;

import com.controller.helper.ResourceError;

public class Segment {
	String id;
	String departure;
	String arrival;
	String duration;
	String type;
	String marketingCarrier;
	String marketingInformation	;
	String operatingCarrier;
	String supplier;
	List<ResourceError>errors;
	List<ResourceError>warnings;
	Place origin;
	Place destination;
	Vehicle vehicle;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMarketingCarrier() {
		return marketingCarrier;
	}
	public void setMarketingCarrier(String marketingCarrier) {
		this.marketingCarrier = marketingCarrier;
	}
	public String getMarketingInformation() {
		return marketingInformation;
	}
	public void setMarketingInformation(String marketingInformation) {
		this.marketingInformation = marketingInformation;
	}
	public String getOperatingCarrier() {
		return operatingCarrier;
	}
	public void setOperatingCarrier(String operatingCarrier) {
		this.operatingCarrier = operatingCarrier;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
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
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	@Override
	public String toString() {
		return "Segment [id=" + id + ", departure=" + departure + ", arrival=" + arrival + ", duration=" + duration
				+ ", type=" + type + ", marketingCarrier=" + marketingCarrier + ", marketingInformation="
				+ marketingInformation + ", operatingCarrier=" + operatingCarrier + ", supplier=" + supplier
				+ ", errors=" + errors + ", warnings=" + warnings + ", origin=" + origin + ", destination="
				+ destination + "]";
	}
	
}
