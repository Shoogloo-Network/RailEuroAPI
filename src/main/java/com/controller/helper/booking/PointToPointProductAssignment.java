package com.controller.helper.booking;

import java.util.List;

public class PointToPointProductAssignment {
	String productCode;
	List<String>segments;
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public List<String> getSegments() {
		return segments;
	}
	public void setSegments(List<String> segments) {
		this.segments = segments;
	}
	@Override
	public String toString() {
		return "PointToPointProductAssignment [productCode=" + productCode + ", segments=" + segments + "]";
	}
	
}
