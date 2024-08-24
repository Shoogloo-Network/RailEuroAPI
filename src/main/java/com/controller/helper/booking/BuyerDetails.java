package com.controller.helper.booking;

public class BuyerDetails {
	AgencyBilling agency;

	@Override
	public String toString() {
		return "{agency:" + agency + "}";
	}

	public AgencyBilling getAgency() {
		return agency;
	}

	public void setAgency(AgencyBilling agency) {
		this.agency = agency;
	}
	

}
