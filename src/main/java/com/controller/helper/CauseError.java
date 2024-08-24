package com.controller.helper;

import java.util.List;

public class CauseError {
	String code;

	List<String> details;
	String label;
	String type;
	@Override
	public String toString() {
		return "CauseError [code=" + code + ", details=" + details + ", label=" + label + ", type=" + type + "]";
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
	
	
}
