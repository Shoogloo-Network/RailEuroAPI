package com.controller.helper.pointoffer;

import java.util.List;

import com.controller.helper.ResourceError;

public class Service {

	String id;
	List<ResourceError> errors;
	List<ResourceError> warnings;
	String type;
	String label;
	@Override
	public String toString() {
		return "Service [id=" + id + ", errors=" + errors + ", warnings=" + warnings + ", type=" + type + ", label="
				+ label + "]";
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
	
}
