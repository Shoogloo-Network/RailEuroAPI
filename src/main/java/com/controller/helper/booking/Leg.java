package com.controller.helper.booking;

import java.util.List;

import com.controller.helper.ResourceError;

public class Leg {
	String	id;

	List<ResourceError>	 errors;
List<ResourceError>	warnings;
	Place origin;

	Place destination;
	String departure;
	String arrival;
	String duration;
	ExchangeEligibility exchangeEligibility;
	List<Segment>segments;
	List<SegmentConnection>segmentConnections;
	Comfort comfortCategory;
	Prices prices;
	String legExchangedFrom;
	String paymentId;
	Boolean canceled;
	@Override
	public String toString() {
		return "Leg [id=" + id + ", errors=" + errors + ", warnings=" + warnings + ", origin=" + origin
				+ ", destination=" + destination + ", departure=" + departure + ", arrival=" + arrival + ", duration="
				+ duration + ", exchangeEligibility=" + exchangeEligibility + ", comfortCategory=" + comfortCategory
				+ ", prices=" + prices + ", legExchangedFrom=" + legExchangedFrom + ", paymentId=" + paymentId
				+ ", canceled=" + canceled + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public ExchangeEligibility getExchangeEligibility() {
		return exchangeEligibility;
	}
	public void setExchangeEligibility(ExchangeEligibility exchangeEligibility) {
		this.exchangeEligibility = exchangeEligibility;
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
	public Comfort getComfortCategory() {
		return comfortCategory;
	}
	public void setComfortCategory(Comfort comfortCategory) {
		this.comfortCategory = comfortCategory;
	}
	public Prices getPrices() {
		return prices;
	}
	public void setPrices(Prices prices) {
		this.prices = prices;
	}
	public String getLegExchangedFrom() {
		return legExchangedFrom;
	}
	public void setLegExchangedFrom(String legExchangedFrom) {
		this.legExchangedFrom = legExchangedFrom;
	}
	public String getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public Boolean getCanceled() {
		return canceled;
	}
	public void setCanceled(Boolean canceled) {
		this.canceled = canceled;
	}
	
	
}
