package com.controller.helper.booking;

public class SupplierReference {
	String pnr;
	String supplierReferenceStatus;
	public String getPnr() {
		return pnr;
	}
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}
	public String getSupplierReferenceStatus() {
		return supplierReferenceStatus;
	}
	public void setSupplierReferenceStatus(String supplierReferenceStatus) {
		this.supplierReferenceStatus = supplierReferenceStatus;
	}
	@Override
	public String toString() {
		return "SupplierReference [pnr=" + pnr + ", supplierReferenceStatus=" + supplierReferenceStatus + "]";
	}
	
}
