package com.controller.helper.pointoffer;

import java.util.List;

import com.controller.helper.ResourceError;

public class Traveler {
	String id;
	List<ResourceError> errors;
	List<ResourceError>warnings;
	Integer age;			
	String type;
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Traveler [id=" + id + ", errors=" + errors + ", warnings=" + warnings + ", age=" + age + ", type="
				+ type + "]";
	}
	
	
}
