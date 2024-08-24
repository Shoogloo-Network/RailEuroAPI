package com.controller.helper.booking;

import java.util.List;

import com.controller.helper.ResourceError;

public class ConfirmRefundResponse {
	
	AfterSalesBalancePrices balancePrices;
	List<AfterSalesItem> items;
	String operationDateTime;
	String expirationDate ;
	public String getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	String status;
	String type;
	String id;
	List<ResourceError>errors;
	List<ResourceError>warnings;
	public AfterSalesBalancePrices getBalancePrices() {
		return balancePrices;
	}
	public void setBalancePrices(AfterSalesBalancePrices balancePrices) {
		this.balancePrices = balancePrices;
	}
	public List<AfterSalesItem> getItems() {
		return items;
	}
	public void setItems(List<AfterSalesItem> items) {
		this.items = items;
	}
	public String getOperationDateTime() {
		return operationDateTime;
	}
	public void setOperationDateTime(String operationDateTime) {
		this.operationDateTime = operationDateTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
		return "ConfirmRefundResponse [balancePrices=" + balancePrices + ", items=" + items + ", operationDateTime="
				+ operationDateTime + ", expirationDate=" + expirationDate + ", status=" + status + ", type=" + type
				+ ", id=" + id + ", errors=" + errors + ", warnings=" + warnings + "]";
	}
	

	
}
