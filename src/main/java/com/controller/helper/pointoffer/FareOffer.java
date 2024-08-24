package com.controller.helper.pointoffer;

import java.util.List;

import com.controller.helper.ResourceError;
import com.controller.helper.booking.Prices;

public class FareOffer {
	String id;
	List<ResourceError> errors;
	
	List<ResourceError>  warnings;
	List<ProductAssignment>fares;
	Prices prices;
	String expiration;
	@Override
	public String toString() {
		return "FareOffer [id=" + id + ", expiration=" + expiration + "]";
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
	public List<ProductAssignment> getFares() {
		return fares;
	}
	public void setFares(List<ProductAssignment> fares) {
		this.fares = fares;
	}
	public Prices getPrices() {
		return prices;
	}
	public void setPrices(Prices prices) {
		this.prices = prices;
	}
	public String getExpiration() {
		return expiration;
	}
	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}
	
}
