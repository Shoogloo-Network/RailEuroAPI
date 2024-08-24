package com.controller.helper.passesoffer;

import java.util.List;

public class PassesOffersSearchRequest {
	Place place;

	List<Traveler> travelers;
	String validityStartDate;

	@Override
	public String toString() {
		return "PassesOffersSearchRequest [validityStartDate=" + validityStartDate + "]";
	}

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}

	public List<Traveler> getTravelers() {
		return travelers;
	}

	public void setTravelers(List<Traveler> travelers) {
		this.travelers = travelers;
	}

	public String getValidityStartDate() {
		return validityStartDate;
	}

	public void setValidityStartDate(String validityStartDate) {
		this.validityStartDate = validityStartDate;
	}

}
