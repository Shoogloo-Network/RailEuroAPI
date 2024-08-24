package com.controller.helper.booking;

public class TravelerDocument {
	String countryCode;
	String documentNumber;
	String expirationDate;
	String type;
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getDocumentNumber() {
		return documentNumber;
	}
	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}
	public String getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "TravelerDocument [countryCode=" + countryCode + ", documentNumber=" + documentNumber
				+ ", expirationDate=" + expirationDate + ", type=" + type + "]";
	}
	
}
