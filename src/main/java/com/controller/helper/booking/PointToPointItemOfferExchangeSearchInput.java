package com.controller.helper.booking;

import java.util.List;

public class PointToPointItemOfferExchangeSearchInput {
	String id;
	List<LegOfferExchangeSearchInput>legs;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<LegOfferExchangeSearchInput> getLegs() {
		return legs;
	}
	public void setLegs(List<LegOfferExchangeSearchInput> legs) {
		this.legs = legs;
	}
	@Override
	public String toString() {
		return "PointToPointItemOfferExchangeSearchInput [id=" + id + ", legs=" + legs + "]";
	}
	
}
