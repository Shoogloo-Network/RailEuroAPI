package com.controller.helper.booking;

import java.util.List;

public class AfterSalesItem {
	String id;
	List<AfterSalesLeg> legs;
	Prices penaltyPrices;
	Prices reversedPrices;
List<EditedTraveler>editedTravelers;
	Prices balancePrices;
	String searchId;
	List<CancellableItem> cancellableItems;
	Boolean delayed;
	String delayExpirationTime;

	List<String> valueDocumentIds;
	Boolean fraudDetected;
	@Override
	public String toString() {
		return "{id=\"" + id + "\", legs:" + legs + ", penaltyPrices=" + penaltyPrices + ", reversedPrices="
				+ reversedPrices + ", balancePrices=" + balancePrices + ", searchId=\"" + searchId + "\", cancellableItems="
				+ cancellableItems + "}";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<AfterSalesLeg> getLegs() {
		return legs;
	}

	public void setLegs(List<AfterSalesLeg> legs) {
		this.legs = legs;
	}

	public Prices getPenaltyPrices() {
		return penaltyPrices;
	}

	public void setPenaltyPrices(Prices penaltyPrices) {
		this.penaltyPrices = penaltyPrices;
	}

	public Prices getReversedPrices() {
		return reversedPrices;
	}

	public void setReversedPrices(Prices reversedPrices) {
		this.reversedPrices = reversedPrices;
	}

	public Prices getBalancePrices() {
		return balancePrices;
	}

	public void setBalancePrices(Prices balancePrices) {
		this.balancePrices = balancePrices;
	}

	public String getSearchId() {
		return searchId;
	}

	public void setSearchId(String searchId) {
		this.searchId = searchId;
	}

	public List<CancellableItem> getCancellableItems() {
		return cancellableItems;
	}

	public void setCancellableItems(List<CancellableItem> cancellableItems) {
		this.cancellableItems = cancellableItems;
	}

	public List<EditedTraveler> getEditedTravelers() {
		return editedTravelers;
	}

	public void setEditedTravelers(List<EditedTraveler> editedTravelers) {
		this.editedTravelers = editedTravelers;
	}

	public Boolean getDelayed() {
		return delayed;
	}

	public void setDelayed(Boolean delayed) {
		this.delayed = delayed;
	}

	public String getDelayExpirationTime() {
		return delayExpirationTime;
	}

	public void setDelayExpirationTime(String delayExpirationTime) {
		this.delayExpirationTime = delayExpirationTime;
	}

	public List<String> getValueDocumentIds() {
		return valueDocumentIds;
	}

	public void setValueDocumentIds(List<String> valueDocumentIds) {
		this.valueDocumentIds = valueDocumentIds;
	}

	public Boolean getFraudDetected() {
		return fraudDetected;
	}

	public void setFraudDetected(Boolean fraudDetected) {
		this.fraudDetected = fraudDetected;
	}

}
