package com.controller.helper.booking;

public class ExchangeQuotationLeg {
	String id;
	
	String selectedOfferId;

	@Override
	public String toString() {
		return "ExchangeQuotationLeg [id=" + id + ", selectedOfferId=" + selectedOfferId + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSelectedOfferId() {
		return selectedOfferId;
	}

	public void setSelectedOfferId(String selectedOfferId) {
		this.selectedOfferId = selectedOfferId;
	}


	
}
