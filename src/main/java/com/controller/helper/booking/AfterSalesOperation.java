package com.controller.helper.booking;

import java.util.List;

import com.controller.helper.ResourceError;

public class AfterSalesOperation {

	String id;
	AfterSalesBalancePrices balancePrices;
	List<AfterSalesItem> items;
	String operationDateTime;
	PointOfSale pointOfSale;
	String status;
	String type;
	List<ResourceError> errors;
	List<ResourceError> warnings;
	String expirationDate;
	String refundType;
	@Override
	public String toString() {
		return "{id:\"" + id + "\", items:" + items + ", operationDateTime:\"" + operationDateTime
				+ "\", status:\"" + status + "\", type:" + type + "\", errors:" + errors + ", warnings:" + warnings + ",balancePrices:"
						+balancePrices +"}";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
	public PointOfSale getPointOfSale() {
		return pointOfSale;
	}
	public void setPointOfSale(PointOfSale pointOfSale) {
		this.pointOfSale = pointOfSale;
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
	public String getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	public String getRefundType() {
		return refundType;
	}
	public void setRefundType(String refundType) {
		this.refundType = refundType;
	}

}
