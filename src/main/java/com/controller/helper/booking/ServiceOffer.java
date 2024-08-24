package com.controller.helper.booking;

import java.util.List;

import com.controller.helper.ResourceError;

public class ServiceOffer {
	String id;
	String service;
	List<String>segments;
	Prices prices;
	Integer count;
	List<ResourceError>errors;
	List<ResourceError>warnings;
	@Override
	public String toString() {
		return "ServiceOffer [id=" + id + ", service=" + service + ", segments=" + segments + ", prices=" + prices
				+ ", count=" + count + ", errors=" + errors + ", warnings=" + warnings + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public List<String> getSegments() {
		return segments;
	}
	public void setSegments(List<String> segments) {
		this.segments = segments;
	}
	public Prices getPrices() {
		return prices;
	}
	public void setPrices(Prices prices) {
		this.prices = prices;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
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
	
}
