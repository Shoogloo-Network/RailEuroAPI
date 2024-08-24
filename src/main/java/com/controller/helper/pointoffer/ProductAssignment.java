package com.controller.helper.pointoffer;

import java.util.List;

public class ProductAssignment {
	String productCode;
	List<String> travelers;
	List<String> segments;
	@Override
	public String toString() {
		return "ProductAssignment [productCode=" + productCode + ", travelers=" + travelers + ", segments=" + segments
				+ "]";
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public List<String> getTravelers() {
		return travelers;
	}
	public void setTravelers(List<String> travelers) {
		this.travelers = travelers;
	}
	public List<String> getSegments() {
		return segments;
	}
	public void setSegments(List<String> segments) {
		this.segments = segments;
	}
	
}
