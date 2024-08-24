package com.controller.helper.booking;

public class BookingTraveler {
	String id;
	String type;
	Integer age;
	String title;
	
	String firstName;
	String lastName;
	String dateOfBirth;
	String emailAddress;
	String phoneNumber;
	Boolean leadTraveler;
	Boolean canceled;
	TravelerDocument travelerDocument;
	
	
	String countryOfResidence;
	
	String placeOfBirth;

	@Override
	public String toString() {
		return "BookingTraveler [id=" + id + ", type=" + type + ", age=" + age + ", title=" + title + ", firstName="
				+ firstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth + ", emailAddress="
				+ emailAddress + ", phoneNumber=" + phoneNumber + ", leadTraveler=" + leadTraveler + ", canceled="
				+ canceled + ", countryOfResidence=" + countryOfResidence + ", placeOfBirth=" + placeOfBirth + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

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

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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

	public Boolean getLeadTraveler() {
		return leadTraveler;
	}

	public void setLeadTraveler(Boolean leadTraveler) {
		this.leadTraveler = leadTraveler;
	}

	public Boolean getCanceled() {
		return canceled;
	}

	public void setCanceled(Boolean canceled) {
		this.canceled = canceled;
	}

	public TravelerDocument getTravelerDocument() {
		return travelerDocument;
	}

	public void setTravelerDocument(TravelerDocument travelerDocument) {
		this.travelerDocument = travelerDocument;
	}

	public String getCountryOfResidence() {
		return countryOfResidence;
	}

	public void setCountryOfResidence(String countryOfResidence) {
		this.countryOfResidence = countryOfResidence;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}
	
}
