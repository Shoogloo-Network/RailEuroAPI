package com.controller.helper.booking;

public class BillingAddress {
	String addressLine1;
	
	String addressLine2;
	
	String countryCode;
	
	String country;
	
	String zipCode;
	
	String city;
	
	String stateCode;
	
	String state;

	@Override
	public String toString() {
		return "BillingAddress [addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", countryCode="
				+ countryCode + ", country=" + country + ", zipCode=" + zipCode + ", city=" + city + ", stateCode="
				+ stateCode + ", state=" + state + "]";
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
	
}
