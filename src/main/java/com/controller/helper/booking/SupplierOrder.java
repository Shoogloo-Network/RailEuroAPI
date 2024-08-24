package com.controller.helper.booking;

import java.util.List;

import com.controller.helper.ResourceError;

public class SupplierOrder {
	String orderStatus;
	String id;
	List<SupplierReference> supplierReferences;
	List<ResourceError>errors;

	List<ResourceError> warnings;

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<SupplierReference> getSupplierReferences() {
		return supplierReferences;
	}

	public void setSupplierReferences(List<SupplierReference> supplierReferences) {
		this.supplierReferences = supplierReferences;
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
		return "SupplierOrder [orderStatus=" + orderStatus + ", id=" + id + ", errors=" + errors + ", warnings="
				+ warnings + "]";
	}
	
}
