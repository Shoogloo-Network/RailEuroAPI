package com.controller.helper;

import java.util.List;

public class ResourceError {
	List<CauseError> causes;
	String code;
	List<String>details;
	String label;
	String type;
	public List<CauseError> getCauses() {
		return causes;
	}
	public void setCauses(List<CauseError> causes) {
		this.causes = causes;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public List<String> getDetails() {
		return details;
	}
	public void setDetails(List<String> details) {
		this.details = details;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "ResourceError [causes=" + causes + ", code=" + code + ", details=" + details + ", label=" + label
				+ ", type=" + type + "]";
	}
	
}
