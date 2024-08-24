package com.controller.helper.booking;

public class Place {
	String id;
	String type;
	String code;
	String label;
	String localLabel;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getLocalLabel() {
		return localLabel;
	}
	public void setLocalLabel(String localLabel) {
		this.localLabel = localLabel;
	}
	@Override
	public String toString() {
		return "Place [id=" + id + ", type=" + type + ", code=" + code + ", label=" + label + ", localLabel="
				+ localLabel + "]";
	}
	
}
