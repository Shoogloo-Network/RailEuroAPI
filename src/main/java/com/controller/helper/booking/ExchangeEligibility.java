package com.controller.helper.booking;

public class ExchangeEligibility {
Boolean eligible;

public Boolean getEligible() {
	return eligible;
}

public void setEligible(Boolean eligible) {
	this.eligible = eligible;
}

@Override
public String toString() {
	return "ExchangeEligibility [eligible=" + eligible + "]";
}

}
