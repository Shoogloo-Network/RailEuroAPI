package com.controller.helper.booking;

import java.util.List;

import com.controller.helper.Flexibility;
import com.controller.helper.ResourceError;

public class PointToPointOffer {
	String id;
	List<ResourceError> errors;
	List<ResourceError> warnings;
	Amount amount;
	Prices prices;
	String category;
	String expiration;
	String billingCurrency;
	String location;
	String providerPriceId;
	List<FareOffer> fareOffers;
	List<ServiceOffer> serviceOffers;
	String legSolution;
	List<String> compatibleOffers;
	Comfort comfortCategory;
	Flexibility flexibility;
	String type;
	List<LegSolutionHighlight> compatibleHighlights;

	@Override
	public String toString() {
		return "PointToPointOffer [id=" + id + ", errors=" + errors + ", warnings=" + warnings + ", prices=" + prices
				+ ", category=" + category + ", expiration=" + expiration + ", billingCurrency=" + billingCurrency
				+ ", location=" + location + ", providerPriceId=" + providerPriceId + ", fareOffers=" + fareOffers
				+ ", serviceOffers=" + serviceOffers + ", legSolution=" + legSolution + ", compatibleOffers="
				+ compatibleOffers + ", comfortCategory=" + comfortCategory + ", flexibility=" + flexibility + ", type="
				+ type + ", compatibleHighlights=" + compatibleHighlights + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public Amount getAmount() {
		return amount;
	}

	public void setAmount(Amount amount) {
		this.amount = amount;
	}

	public Prices getPrices() {
		return prices;
	}

	public void setPrices(Prices prices) {
		this.prices = prices;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getExpiration() {
		return expiration;
	}

	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}

	public String getBillingCurrency() {
		return billingCurrency;
	}

	public void setBillingCurrency(String billingCurrency) {
		this.billingCurrency = billingCurrency;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getProviderPriceId() {
		return providerPriceId;
	}

	public void setProviderPriceId(String providerPriceId) {
		this.providerPriceId = providerPriceId;
	}

	public List<FareOffer> getFareOffers() {
		return fareOffers;
	}

	public void setFareOffers(List<FareOffer> fareOffers) {
		this.fareOffers = fareOffers;
	}

	public List<ServiceOffer> getServiceOffers() {
		return serviceOffers;
	}

	public void setServiceOffers(List<ServiceOffer> serviceOffers) {
		this.serviceOffers = serviceOffers;
	}

	public String getLegSolution() {
		return legSolution;
	}

	public void setLegSolution(String legSolution) {
		this.legSolution = legSolution;
	}

	public List<String> getCompatibleOffers() {
		return compatibleOffers;
	}

	public void setCompatibleOffers(List<String> compatibleOffers) {
		this.compatibleOffers = compatibleOffers;
	}

	public Comfort getComfortCategory() {
		return comfortCategory;
	}

	public void setComfortCategory(Comfort comfortCategory) {
		this.comfortCategory = comfortCategory;
	}

	public Flexibility getFlexibility() {
		return flexibility;
	}

	public void setFlexibility(Flexibility flexibility) {
		this.flexibility = flexibility;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<LegSolutionHighlight> getCompatibleHighlights() {
		return compatibleHighlights;
	}

	public void setCompatibleHighlights(List<LegSolutionHighlight> compatibleHighlights) {
		this.compatibleHighlights = compatibleHighlights;
	}

}