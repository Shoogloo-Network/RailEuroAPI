package com.controller.helper.booking;

public class EditedTraveler {
	String travelerId;
	String firstName;
	String lastName;
	public String getTravelerId() {
		return travelerId;
	}
	public void setTravelerId(String travelerId) {
		this.travelerId = travelerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "EditedTraveler [travelerId=" + travelerId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
}
