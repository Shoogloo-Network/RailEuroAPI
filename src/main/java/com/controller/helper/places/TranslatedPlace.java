package com.controller.helper.places;

import java.util.List;

import com.controller.helper.ResourceError;

public class TranslatedPlace {
	String id;

List<ResourceError>errors;
List<ResourceError>warnings;
TranslatedCountry country;
String timezone;
Location location;
String localLabel;
String label;
String code;
String type;	
@Override
public String toString() {
	return "TranslatedPlace [id=" + id + ", errors=" + errors + ", warnings=" + warnings + ", country=" + country
			+ ", timezone=" + timezone + ", location=" + location + ", localLabel=" + localLabel + ", label=" + label
			+ ", code=" + code + ", type=" + type + "]";
}
public String getId() {
	return id;
}

public String getLocalLabel() {
	return localLabel;
}
public void setLocalLabel(String localLabel) {
	this.localLabel = localLabel;
}
public String getLabel() {
	return label;
}
public void setLabel(String label) {
	this.label = label;
}
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
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
public TranslatedCountry getCountry() {
	return country;
}
public void setCountry(TranslatedCountry country) {
	this.country = country;
}
public String getTimezone() {
	return timezone;
}
public void setTimezone(String timezone) {
	this.timezone = timezone;
}
public Location getLocation() {
	return location;
}
public void setLocation(Location location) {
	this.location = location;
}

}
