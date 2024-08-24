package com.controller.helper.booking;

public class BookingSearchViewTraveler {
	String title;
	String firstName;
	String lastName;
	String type;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "BookingSearchViewTraveler [title=" + title + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", type=" + type + "]";
	}
	
}
