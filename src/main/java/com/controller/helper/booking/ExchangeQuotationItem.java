package com.controller.helper.booking;

public class ExchangeQuotationItem {
	String id;
	
	String searchId;
	ExchangeQuotationLeg legs;
	@Override
	public String toString() {
		return "ExchangeQuotationItem [id=" + id + ", searchId=" + searchId + ", legs=" + legs + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSearchId() {
		return searchId;
	}
	public void setSearchId(String searchId) {
		this.searchId = searchId;
	}
	public ExchangeQuotationLeg getLegs() {
		return legs;
	}
	public void setLegs(ExchangeQuotationLeg legs) {
		this.legs = legs;
	}


	
}
