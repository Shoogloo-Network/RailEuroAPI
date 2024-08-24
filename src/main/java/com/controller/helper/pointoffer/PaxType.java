package com.controller.helper.pointoffer;

public class PaxType {
	String code;
	String label;
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
	@Override
	public String toString() {
		return "PaxType [code=" + code + ", label=" + label + "]";
	}
	
}
