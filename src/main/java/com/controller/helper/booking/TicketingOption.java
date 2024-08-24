package com.controller.helper.booking;

import java.util.List;

import com.controller.helper.ResourceError;

public class TicketingOption {
	String code;
	String id;
	String description;
	String type;
	

List<ResourceError>errors;
List<ResourceError>warnings;
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
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
@Override
public String toString() {
	return "TicketingOption [code=" + code + ", id=" + id + ", description=" + description + ", type=" + type
			+ ", errors=" + errors + ", warnings=" + warnings + "]";
}


}
