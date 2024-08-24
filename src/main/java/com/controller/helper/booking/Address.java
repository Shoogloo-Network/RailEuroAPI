package com.controller.helper.booking;

public class Address {
	String address1;

	String address2;
	
	String city;
	
	String country;
	
	String countryCode;
	
	String state;
	
	String zipCode;
	
	String	stateCode;

	@Override
	public String toString() {
		return "{address1:\"" + address1 + "\", address2:\"" + address2 + "\", city:\"" + city + "\", country:\"" + country
				+ "\", countryCode:\"" + countryCode + "\", state:\"" + state + "\", zipCode:\"" + zipCode + "\","
						+ " stateCode:\""+ stateCode + "\"}";
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	
}
