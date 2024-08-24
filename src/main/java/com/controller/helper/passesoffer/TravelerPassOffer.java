package com.controller.helper.passesoffer;

import com.controller.helper.booking.Prices;

public class TravelerPassOffer {
	Prices prices;

	String travelerId;

	String productCode;

	PassTravelClass passTravelClass;

	@Override
	public String toString() {
		return "TravelerPassOffer [travelerId=" + travelerId + ", productCode=" + productCode + "]";
	}

	public Prices getPrices() {
		return prices;
	}

	public void setPrices(Prices prices) {
		this.prices = prices;
	}

	public String getTravelerId() {
		return travelerId;
	}

	public void setTravelerId(String travelerId) {
		this.travelerId = travelerId;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public PassTravelClass getPassTravelClass() {
		return passTravelClass;
	}

	public void setPassTravelClass(PassTravelClass passTravelClass) {
		this.passTravelClass = passTravelClass;
	}

}
