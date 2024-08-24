package com.controller.helper.pointoffer.custom;

import java.util.List;

import com.controller.helper.pointoffer.LegRequest;
import com.controller.helper.pointoffer.TravelerRequest;

public class SearchRequest {

	List<TravelerRequest> travelers;
	List<LegRequest> legs;
	@Override
	public String toString() {
		return "SearchRequest [travelers=" + travelers + ", legs=" + legs + "]";
	}
	public List<TravelerRequest> getTravelers() {
		return travelers;
	}
	public void setTravelers(List<TravelerRequest> travelers) {
		this.travelers = travelers;
	}
	public List<LegRequest> getLegs() {
		return legs;
	}
	public void setLegs(List<LegRequest> legs) {
		this.legs = legs;
	}
	


}
