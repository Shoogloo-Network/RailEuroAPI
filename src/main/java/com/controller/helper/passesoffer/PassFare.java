package com.controller.helper.passesoffer;

public class PassFare {
	String validityDuration;
	
	Number numberOfTravelDays;
	
	String activationDuration;

	@Override
	public String toString() {
		return "PassFare [validityDuration=" + validityDuration + ", numberOfTravelDays=" + numberOfTravelDays
				+ ", activationDuration=" + activationDuration + "]";
	}

	public String getValidityDuration() {
		return validityDuration;
	}

	public void setValidityDuration(String validityDuration) {
		this.validityDuration = validityDuration;
	}

	public Number getNumberOfTravelDays() {
		return numberOfTravelDays;
	}

	public void setNumberOfTravelDays(Number numberOfTravelDays) {
		this.numberOfTravelDays = numberOfTravelDays;
	}

	public String getActivationDuration() {
		return activationDuration;
	}

	public void setActivationDuration(String activationDuration) {
		this.activationDuration = activationDuration;
	}
	
}
