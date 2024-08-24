package com.controller.helper.booking;

public class ClaimBillingDocumentsRequest {
	String existingBillingProfileId;
	
	BillingDocumentsProfile newBillingProfile;

	public String getExistingBillingProfileId() {
		return existingBillingProfileId;
	}

	public void setExistingBillingProfileId(String existingBillingProfileId) {
		this.existingBillingProfileId = existingBillingProfileId;
	}

	public BillingDocumentsProfile getNewBillingProfile() {
		return newBillingProfile;
	}

	public void setNewBillingProfile(BillingDocumentsProfile newBillingProfile) {
		this.newBillingProfile = newBillingProfile;
	}

	@Override
	public String toString() {
		return "ClaimBillingDocumentsRequest [existingBillingProfileId=" + existingBillingProfileId
				+ ", newBillingProfile=" + newBillingProfile + "]";
	}
	
}
