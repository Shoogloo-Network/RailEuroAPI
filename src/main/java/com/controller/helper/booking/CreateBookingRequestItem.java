package com.controller.helper.booking;

import java.util.List;

public class CreateBookingRequestItem {
List<String>offerLocations;

public List<String> getOfferLocations() {
	return offerLocations;
}

public void setOfferLocations(List<String> offerLocations) {
	this.offerLocations = offerLocations;
}

@Override
public String toString() {
	return "CreateBookingRequestItem [offerLocations=" + offerLocations + "]";
}

}
