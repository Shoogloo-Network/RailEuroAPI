package com.controller.helper.passesoffer;

public class PassTravelClass {
	String code;
	
	String label;
	
	PassComfort comfortCategory;

	@Override
	public String toString() {
		return "PassTravelClass [code=" + code + ", label=" + label + "]";
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

	public PassComfort getComfortCategory() {
		return comfortCategory;
	}

	public void setComfortCategory(PassComfort comfortCategory) {
		this.comfortCategory = comfortCategory;
	}
	
}
