package com.controller.helper.booking;

import java.util.List;

public class FeeProduct {
	String code;
	String label;
	String family;
	String method;
	List<String>categories;
	Applicability applicability;
	@Override
	public String toString() {
		return "FeeProduct [code=" + code + ", label=" + label + ", family=" + family + ", method=" + method
				+ ", categories=" + categories + "]";
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
	public String getFamily() {
		return family;
	}
	public void setFamily(String family) {
		this.family = family;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public List<String> getCategories() {
		return categories;
	}
	public void setCategories(List<String> categories) {
		this.categories = categories;
	}
	public Applicability getApplicability() {
		return applicability;
	}
	public void setApplicability(Applicability applicability) {
		this.applicability = applicability;
	}
	
}
