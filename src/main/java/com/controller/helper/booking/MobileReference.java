package com.controller.helper.booking;

public class MobileReference {
	String reference;
	
	String	travelerId;
	
	String status;

	@Override
	public String toString() {
		return "MobileReference [reference=" + reference + ", travelerId=" + travelerId + ", status=" + status + "]";
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getTravelerId() {
		return travelerId;
	}

	public void setTravelerId(String travelerId) {
		this.travelerId = travelerId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
