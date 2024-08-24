package com.controller.helper.booking;

public class BillingDocumentsProfile {
	String id;
	String type;
	String profileName;
	String fiscalCode;
	String vatNumber;
	String firstName;
	String lastName;
	String address;
	String country;
	String province;
	String city;
	String zipCode;
	@Override
	public String toString() {
		return "BillingDocumentsProfile [id=" + id + ", type=" + type + ", profileName=" + profileName + ", fiscalCode="
				+ fiscalCode + ", vatNumber=" + vatNumber + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", address=" + address + ", country=" + country + ", province=" + province + ", city=" + city
				+ ", zipCode=" + zipCode + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getProfileName() {
		return profileName;
	}
	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}
	public String getFiscalCode() {
		return fiscalCode;
	}
	public void setFiscalCode(String fiscalCode) {
		this.fiscalCode = fiscalCode;
	}
	public String getVatNumber() {
		return vatNumber;
	}
	public void setVatNumber(String vatNumber) {
		this.vatNumber = vatNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	
}
