package com.controller.helper.passesoffer;

import java.util.List;

import com.controller.helper.ResourceError;

public class PassesOffersSearch {
List<PassOffer>	offers;
String 	id;		
List<PassProduct>products;

List<Traveler>	travelers;
String validityStartDate;
List<ResourceError>	errors;

List<ResourceError>	warnings;

@Override
public String toString() {
	return "PassesOffersSearch [offers=" + offers + ", id=" + id + ", validityStartDate=" + validityStartDate + "]";
}

public List<PassOffer> getOffers() {
	return offers;
}

public void setOffers(List<PassOffer> offers) {
	this.offers = offers;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public List<PassProduct> getProducts() {
	return products;
}

public void setProducts(List<PassProduct> products) {
	this.products = products;
}

public List<Traveler> getTravelers() {
	return travelers;
}

public void setTravelers(List<Traveler> travelers) {
	this.travelers = travelers;
}

public String getValidityStartDate() {
	return validityStartDate;
}

public void setValidityStartDate(String validityStartDate) {
	this.validityStartDate = validityStartDate;
}

public List<ResourceError> getErrors() {
	return errors;
}

public void setErrors(List<ResourceError> errors) {
	this.errors = errors;
}

public List<ResourceError> getWarnings() {
	return warnings;
}

public void setWarnings(List<ResourceError> warnings) {
	this.warnings = warnings;
}


}
