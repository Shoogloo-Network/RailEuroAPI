package com.controller.helper.booking;

public class PassFare {
	String validityDuration;
	Number numberOfTravelDays;
	String activationDuration;
	String	code;
	
	String	label;

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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return "PassFare [validityDuration=" + validityDuration + ", numberOfTravelDays=" + numberOfTravelDays
				+ ", activationDuration=" + activationDuration + ", code=" + code + ", label=" + label + "]";
	}
	
	
}
