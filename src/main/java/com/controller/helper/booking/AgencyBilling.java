package com.controller.helper.booking;

public class AgencyBilling {
	String agencyName;
	/*<= 254 characters
Match pattern:
^[a-zA-Z0-9][a-zA-Z0-9._%+-]{0,63}@(?:[a-zA-Z0-9][a-zA-Z0-9-]{0,62}\.)+[a-zA-Z]{2,63}$*/
	String emailAddress;
	/*<= 25 characters*/
	String phoneNumber;
	@Override
	public String toString() {
		return "{agencyName:\"" + agencyName + "\", emailAddress:\"" + emailAddress + "\", phoneNumber:\""
				+ phoneNumber + "\"}";
	}
	public String getAgencyName() {
		return agencyName;
	}
	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
