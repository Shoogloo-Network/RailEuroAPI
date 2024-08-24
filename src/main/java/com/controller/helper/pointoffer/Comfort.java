package com.controller.helper.pointoffer;

public class Comfort {
	String code;
	String label="string";
	@Override
	public String toString() {
		return "Comfort [code=" + code + ", label=" + label + "]";
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
	
}
