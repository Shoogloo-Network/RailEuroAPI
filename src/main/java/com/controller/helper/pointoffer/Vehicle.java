package com.controller.helper.pointoffer;

public class Vehicle {
	String type;
	String reference;
	String code;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "Vehicle [type=" + type + ", reference=" + reference + ", code=" + code + "]";
	}
	
}
