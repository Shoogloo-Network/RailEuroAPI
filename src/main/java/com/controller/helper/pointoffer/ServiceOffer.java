package com.controller.helper.pointoffer;

import java.util.List;

public class ServiceOffer {
	String service;

	List<String>travelers;
	List<String> segments;
	@Override
	public String toString() {
		return "ServiceOffer [service=" + service + ", travelers=" + travelers + ", segments=" + segments + "]";
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public List<String> getTravelers() {
		return travelers;
	}
	public void setTravelers(List<String> travelers) {
		this.travelers = travelers;
	}
	public List<String> getSegments() {
		return segments;
	}
	public void setSegments(List<String> segments) {
		this.segments = segments;
	}
	
}
