package com.controller.helper.booking;

import java.util.List;

import com.controller.helper.ResourceError;

public class PassProductAssignment {
String id;
Boolean canceled;
String	productCode;
String	travelerId;
	Prices prices;
	
	PassProductAssignmentCancellationEligibility cancelationEligibility;
	List<ResourceError>errors;
	List<ResourceError>warnings;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Boolean getCanceled() {
		return canceled;
	}
	public void setCanceled(Boolean canceled) {
		this.canceled = canceled;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getTravelerId() {
		return travelerId;
	}
	public void setTravelerId(String travelerId) {
		this.travelerId = travelerId;
	}
	public Prices getPrices() {
		return prices;
	}
	public void setPrices(Prices prices) {
		this.prices = prices;
	}
	public PassProductAssignmentCancellationEligibility getCancelationEligibility() {
		return cancelationEligibility;
	}
	public void setCancelationEligibility(PassProductAssignmentCancellationEligibility cancelationEligibility) {
		this.cancelationEligibility = cancelationEligibility;
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
		return "PassProductAssignment [id=" + id + ", canceled=" + canceled + ", productCode=" + productCode
				+ ", travelerId=" + travelerId + ", prices=" + prices + ", cancelationEligibility="
				+ cancelationEligibility + ", errors=" + errors + ", warnings=" + warnings + "]";
	}
	
	
}
