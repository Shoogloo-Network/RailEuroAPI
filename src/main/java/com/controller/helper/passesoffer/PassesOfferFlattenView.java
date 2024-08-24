package com.controller.helper.passesoffer;

import java.util.List;

import com.controller.helper.ResourceError;
import com.controller.helper.booking.Prices;

public class PassesOfferFlattenView {

	List<PassProduct> products;
	List<Traveler> travelers;
	List<PassCondition> conditions;
	String expirationDate;

	List<String> tags;
	PassTravelClass travelClass;

	List<TravelerPassOffer> travelerPassOffers;
	String type = "pass-offer";
	TravelerInformationRequired travelerInformationRequired;
	Prices prices;
	String label;
	String validityDuration;
	PassPeriod validityPeriod;
	Integer numberOfTravelDays;
	String activationDuration;
	PassPeriod activationPeriod;
	String location;
	List<ResourceError> errors;
	List<ResourceError> warnings;
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
	public List<PassCondition> getConditions() {
		return conditions;
	}
	public void setConditions(List<PassCondition> conditions) {
		this.conditions = conditions;
	}
	public String getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	public PassTravelClass getTravelClass() {
		return travelClass;
	}
	public void setTravelClass(PassTravelClass travelClass) {
		this.travelClass = travelClass;
	}
	public List<TravelerPassOffer> getTravelerPassOffers() {
		return travelerPassOffers;
	}
	public void setTravelerPassOffers(List<TravelerPassOffer> travelerPassOffers) {
		this.travelerPassOffers = travelerPassOffers;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public TravelerInformationRequired getTravelerInformationRequired() {
		return travelerInformationRequired;
	}
	public void setTravelerInformationRequired(TravelerInformationRequired travelerInformationRequired) {
		this.travelerInformationRequired = travelerInformationRequired;
	}
	public Prices getPrices() {
		return prices;
	}
	public void setPrices(Prices prices) {
		this.prices = prices;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getValidityDuration() {
		return validityDuration;
	}
	public void setValidityDuration(String validityDuration) {
		this.validityDuration = validityDuration;
	}
	public PassPeriod getValidityPeriod() {
		return validityPeriod;
	}
	public void setValidityPeriod(PassPeriod validityPeriod) {
		this.validityPeriod = validityPeriod;
	}
	public Integer getNumberOfTravelDays() {
		return numberOfTravelDays;
	}
	public void setNumberOfTravelDays(Integer numberOfTravelDays) {
		this.numberOfTravelDays = numberOfTravelDays;
	}
	public String getActivationDuration() {
		return activationDuration;
	}
	public void setActivationDuration(String activationDuration) {
		this.activationDuration = activationDuration;
	}
	public PassPeriod getActivationPeriod() {
		return activationPeriod;
	}
	public void setActivationPeriod(PassPeriod activationPeriod) {
		this.activationPeriod = activationPeriod;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
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
	@Override
	public String toString() {
		return "PassesOfferFlattenView [products=" + products + ", travelers=" + travelers + ", conditions="
				+ conditions + ", expirationDate=" + expirationDate + ", tags=" + tags + ", travelClass=" + travelClass
				+ ", travelerPassOffers=" + travelerPassOffers + ", type=" + type + ", travelerInformationRequired="
				+ travelerInformationRequired + ", prices=" + prices + ", label=" + label + ", validityDuration="
				+ validityDuration + ", validityPeriod=" + validityPeriod + ", numberOfTravelDays=" + numberOfTravelDays
				+ ", activationDuration=" + activationDuration + ", activationPeriod=" + activationPeriod
				+ ", location=" + location + ", errors=" + errors + ", warnings=" + warnings + "]";
	}

}
