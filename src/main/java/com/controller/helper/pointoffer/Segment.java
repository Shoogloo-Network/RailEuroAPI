package com.controller.helper.pointoffer;

import com.controller.helper.ResourceError;

public class Segment {
String id;
ResourceError errors;
ResourceError warnings;
Integer sequenceNumber;
Place origin;
Place  destination;
String departure;
String arrival;
String duration;
String operatingCarrier;
String marketingCarrier;
String supplier;
Vehicle vehicle;
String type;
String marketingInformation;
@Override
public String toString() {
	return "Segment [id=" + id + ", errors=" + errors + ", warnings=" + warnings + ", sequenceNumber=" + sequenceNumber
			+ ", departure=" + departure + ", arrival=" + arrival + ", duration=" + duration + ", operatingCarrier="
			+ operatingCarrier + ", marketingCarrier=" + marketingCarrier + ", supplier=" + supplier + ", vehicle="
			+ vehicle + ", type=" + type + ", marketingInformation=" + marketingInformation + "]";
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public ResourceError getErrors() {
	return errors;
}
public void setErrors(ResourceError errors) {
	this.errors = errors;
}
public ResourceError getWarnings() {
	return warnings;
}
public void setWarnings(ResourceError warnings) {
	this.warnings = warnings;
}
public Integer getSequenceNumber() {
	return sequenceNumber;
}
public void setSequenceNumber(Integer sequenceNumber) {
	this.sequenceNumber = sequenceNumber;
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
public String getOperatingCarrier() {
	return operatingCarrier;
}
public void setOperatingCarrier(String operatingCarrier) {
	this.operatingCarrier = operatingCarrier;
}
public String getMarketingCarrier() {
	return marketingCarrier;
}
public void setMarketingCarrier(String marketingCarrier) {
	this.marketingCarrier = marketingCarrier;
}
public String getSupplier() {
	return supplier;
}
public void setSupplier(String supplier) {
	this.supplier = supplier;
}
public Vehicle getVehicle() {
	return vehicle;
}
public void setVehicle(Vehicle vehicle) {
	this.vehicle = vehicle;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getMarketingInformation() {
	return marketingInformation;
}
public void setMarketingInformation(String marketingInformation) {
	this.marketingInformation = marketingInformation;
}

}
