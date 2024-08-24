package com.controller.helper.booking;

import java.util.List;

public class AfterSalesItemInput {
	String id;
	List<AfterSalesLeg> legs;
	List<CancellableItem> cancellableItems;
	//MANUAL_REFUND, REFUND, EXCHANGE, TRAVELERS_EDITION
	String type;
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
	public List<CancellableItem> getCancellableItems() {
		return cancellableItems;
	}
	public void setCancellableItems(List<CancellableItem> cancellableItems) {
		this.cancellableItems = cancellableItems;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "AfterSalesItemInput [id=" + id + ", legs=" + legs + ", cancellableItems=" + cancellableItems + ", type="
				+ type + "]";
	}

}
