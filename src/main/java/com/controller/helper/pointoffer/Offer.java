package com.controller.helper.pointoffer;

import java.util.List;

import com.controller.helper.ResourceError;
import com.controller.helper.booking.Prices;

public class Offer {
	String id;

	List<ResourceError> errors;
	List<ResourceError> warnings;
	Prices prices;
	String category;
	String expirationDate;
	String location;
	String type;

	@Override
	public String toString() {
		return "Offer [id=" + id + ", errors=" + errors + ", warnings=" + warnings + ", prices=" + prices
				+ ", category=" + category + ", expirationDate=" + expirationDate + ", location=" + location + ", type="
				+ type + "]";
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

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
