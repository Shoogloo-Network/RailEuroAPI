package com.controller.helper.booking;

import java.util.List;

public class PassProduct {
	String code;
	String label;
	String supplier;
	String type;
	PassFare fare;
	PassTravelClass travelClass;
	String	marketingCarrier;
	List<String>places;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public PassFare getFare() {
		return fare;
	}
	public void setFare(PassFare fare) {
		this.fare = fare;
	}
	public PassTravelClass getTravelClass() {
		return travelClass;
	}
	public void setTravelClass(PassTravelClass travelClass) {
		this.travelClass = travelClass;
	}
	public String getMarketingCarrier() {
		return marketingCarrier;
	}
	public void setMarketingCarrier(String marketingCarrier) {
		this.marketingCarrier = marketingCarrier;
	}
	public List<String> getPlaces() {
		return places;
	}
	public void setPlaces(List<String> places) {
		this.places = places;
	}
	@Override
	public String toString() {
		return "PassProduct [code=" + code + ", label=" + label + ", supplier=" + supplier + ", type=" + type
				+ ", marketingCarrier=" + marketingCarrier + ", places=" + places + "]";
	}
	
}