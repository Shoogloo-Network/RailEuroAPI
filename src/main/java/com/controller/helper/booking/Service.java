package com.controller.helper.booking;

import java.util.List;

import com.controller.helper.ResourceError;

public class Service {
	String id;
	List<ResourceError> errors;
	List<ResourceError> warnings;
	String type;
	String label;
	Prices unitPrices;
	Integer maxAllowedCount;
	Boolean included;
	List<String>segments;
	String productCode;
	Boolean additionalService;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public Prices getUnitPrices() {
		return unitPrices;
	}
	public void setUnitPrices(Prices unitPrices) {
		this.unitPrices = unitPrices;
	}
	public Integer getMaxAllowedCount() {
		return maxAllowedCount;
	}
	public void setMaxAllowedCount(Integer maxAllowedCount) {
		this.maxAllowedCount = maxAllowedCount;
	}
	public Boolean getIncluded() {
		return included;
	}
	public void setIncluded(Boolean included) {
		this.included = included;
	}
	public List<String> getSegments() {
		return segments;
	}
	public void setSegments(List<String> segments) {
		this.segments = segments;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public Boolean getAdditionalService() {
		return additionalService;
	}
	public void setAdditionalService(Boolean additionalService) {
		this.additionalService = additionalService;
	}
	@Override
	public String toString() {
		return "Service [id=" + id + ", errors=" + errors + ", warnings=" + warnings + ", type=" + type + ", label="
				+ label + ", unitPrices=" + unitPrices + ", maxAllowedCount=" + maxAllowedCount + ", included="
				+ included + ", segments=" + segments + ", productCode=" + productCode + ", additionalService="
				+ additionalService + "]";
	}
	

}
