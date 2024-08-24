package com.controller.helper.booking;

import java.util.List;

import com.controller.helper.ResourceError;

public class FareOffer {
	@Deprecated
	String expiration;
	List<PointToPointProductAssignment>fares;
	FareOfferPrices prices ;
	SupplierReference supplierReference;
	String id;
	List<ResourceError>errors;
	List<ResourceError>warnings
;
	public String getExpiration() {
		return expiration;
	}
	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}
	public List<PointToPointProductAssignment> getFares() {
		return fares;
	}
	public void setFares(List<PointToPointProductAssignment> fares) {
		this.fares = fares;
	}
	public FareOfferPrices getPrices() {
		return prices;
	}
	public void setPrices(FareOfferPrices prices) {
		this.prices = prices;
	}
	public SupplierReference getSupplierReference() {
		return supplierReference;
	}
	public void setSupplierReference(SupplierReference supplierReference) {
		this.supplierReference = supplierReference;
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
	@Override
	public String toString() {
		return "FareOffer [expiration=" + expiration + ", fares=" + fares + ", prices=" + prices
				+ ", supplierReference=" + supplierReference + ", id=" + id + ", errors=" + errors + ", warnings="
				+ warnings + "]";
	}
	
	
}
