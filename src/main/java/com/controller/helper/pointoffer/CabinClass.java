package com.controller.helper.pointoffer;

public class CabinClass {
	String code;
	String label;
	Comfort comfortCategory;
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
	@Override
	public String toString() {
		return "CabinClass [code=" + code + ", label=" + label + ", comfortCategory=" + comfortCategory + "]";
	}
	
}
