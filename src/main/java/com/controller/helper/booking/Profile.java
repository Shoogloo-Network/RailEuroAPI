package com.controller.helper.booking;

public class Profile {
	AgencyProfile agency;
	String city;
	String country;
	String salesChannel;
	String timezone;
	String zone;
	String defaultPriceToDisplay;

KeyAccount keyAccount;
Payment payment;

AuthorizedProducts authorizedProducts;

public AgencyProfile getAgency() {
	return agency;
}

public void setAgency(AgencyProfile agency) {
	this.agency = agency;
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

public String getSalesChannel() {
	return salesChannel;
}

public void setSalesChannel(String salesChannel) {
	this.salesChannel = salesChannel;
}

public String getTimezone() {
	return timezone;
}

public void setTimezone(String timezone) {
	this.timezone = timezone;
}

public String getZone() {
	return zone;
}

public void setZone(String zone) {
	this.zone = zone;
}

public String getDefaultPriceToDisplay() {
	return defaultPriceToDisplay;
}

public void setDefaultPriceToDisplay(String defaultPriceToDisplay) {
	this.defaultPriceToDisplay = defaultPriceToDisplay;
}

public KeyAccount getKeyAccount() {
	return keyAccount;
}

public void setKeyAccount(KeyAccount keyAccount) {
	this.keyAccount = keyAccount;
}

public Payment getPayment() {
	return payment;
}

public void setPayment(Payment payment) {
	this.payment = payment;
}

public AuthorizedProducts getAuthorizedProducts() {
	return authorizedProducts;
}

public void setAuthorizedProducts(AuthorizedProducts authorizedProducts) {
	this.authorizedProducts = authorizedProducts;
}

@Override
public String toString() {
	return "Profile [city=" + city + ", country=" + country + ", salesChannel=" + salesChannel + ", timezone="
			+ timezone + ", zone=" + zone + ", defaultPriceToDisplay=" + defaultPriceToDisplay + ", keyAccount="
			+ keyAccount + ", payment=" + payment + "]";
}

}
