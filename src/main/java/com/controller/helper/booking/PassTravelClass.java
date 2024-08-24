package com.controller.helper.booking;
public class PassTravelClass {
	String code;
	
	String label;
	
	Comfort comfortCategory;

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

	public Comfort getComfortCategory() {
		return comfortCategory;
	}

	public void setComfortCategory(Comfort comfortCategory) {
		this.comfortCategory = comfortCategory;
	}

	
	
}