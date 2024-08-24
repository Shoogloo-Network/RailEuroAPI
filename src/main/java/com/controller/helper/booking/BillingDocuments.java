package com.controller.helper.booking;

public class BillingDocuments {

	BillingDocumentsProfile profile;

	@Override
	public String toString() {
		return "BillingDocuments [profile=" + profile + "]";
	}

	public BillingDocumentsProfile getProfile() {
		return profile;
	}

	public void setProfile(BillingDocumentsProfile profile) {
		this.profile = profile;
	}

}
