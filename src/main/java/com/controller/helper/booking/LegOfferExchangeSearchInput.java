package com.controller.helper.booking;

import java.util.List;

public class LegOfferExchangeSearchInput {
	String id;
	String departure;
	Place origin;
	Place destination;
	List<String>productFilters;
	@Override
	public String toString() {
		return "LegOfferExchangeSearchInput [id=" + id + ", departure=" + departure + ", origin=" + origin
				+ ", destination=" + destination + ", productFilters=" + productFilters + "]";
	}
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
	public List<String> getProductFilters() {
		return productFilters;
	}
	public void setProductFilters(List<String> productFilters) {
		this.productFilters = productFilters;
	}
	

}
