package com.controller.helper.passesoffer;

import java.util.List;

public class PassProduct {
	String code;
	String label;
	PassFare fare;
	String supplier;
	String	marketingCarrier;
	List<String>places;
	@Override
	public String toString() {
		return "PassProduct [code=" + code + ", label=" + label + ", fare=" + fare + ", supplier=" + supplier
				+ ", marketingCarrier=" + marketingCarrier + ", places=" + places + "]";
	}
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
	public PassFare getFare() {
		return fare;
	}
	public void setFare(PassFare fare) {
		this.fare = fare;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
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

}
