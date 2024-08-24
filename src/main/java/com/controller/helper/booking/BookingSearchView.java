package com.controller.helper.booking;

import java.util.List;

import com.controller.helper.Contact;

public class BookingSearchView {
	String id;
	String bookingStatus;
	String bookingReference;
	String agencyBookingReference;
	Contact contact;
	TotalPrice totalPrice;
	String bookingOverviewStatus;

	String bookingCreationDate;
	String bookingModificationDate;
	String holdExpirationDate;

	String travelDate;
	List<BookingSearchViewTraveler> travelers;
	String region;
	String user;
	String agencyName;
	List<String> marketingCarriers;
	String meanOfPayment;
	List<String> supplierReferences;
	@Override
	public String toString() {
		return "BookingSearchView [id=" + id + ", bookingStatus=" + bookingStatus + ", bookingReference="
				+ bookingReference + ", agencyBookingReference=" + agencyBookingReference + ", bookingOverviewStatus="
				+ bookingOverviewStatus + ", bookingCreationDate=" + bookingCreationDate + ", bookingModificationDate="
				+ bookingModificationDate + ", holdExpirationDate=" + holdExpirationDate + ", travelDate=" + travelDate
				+ ", region=" + region + ", user=" + user + ", agencyName=" + agencyName + ", marketingCarriers="
				+ marketingCarriers + ", meanOfPayment=" + meanOfPayment + ", supplierReferences=" + supplierReferences
				+ "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	public String getBookingReference() {
		return bookingReference;
	}
	public void setBookingReference(String bookingReference) {
		this.bookingReference = bookingReference;
	}
	public String getAgencyBookingReference() {
		return agencyBookingReference;
	}
	public void setAgencyBookingReference(String agencyBookingReference) {
		this.agencyBookingReference = agencyBookingReference;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	public TotalPrice getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(TotalPrice totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getBookingOverviewStatus() {
		return bookingOverviewStatus;
	}
	public void setBookingOverviewStatus(String bookingOverviewStatus) {
		this.bookingOverviewStatus = bookingOverviewStatus;
	}
	public String getBookingCreationDate() {
		return bookingCreationDate;
	}
	public void setBookingCreationDate(String bookingCreationDate) {
		this.bookingCreationDate = bookingCreationDate;
	}
	public String getBookingModificationDate() {
		return bookingModificationDate;
	}
	public void setBookingModificationDate(String bookingModificationDate) {
		this.bookingModificationDate = bookingModificationDate;
	}
	public String getHoldExpirationDate() {
		return holdExpirationDate;
	}
	public void setHoldExpirationDate(String holdExpirationDate) {
		this.holdExpirationDate = holdExpirationDate;
	}
	public String getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(String travelDate) {
		this.travelDate = travelDate;
	}
	public List<BookingSearchViewTraveler> getTravelers() {
		return travelers;
	}
	public void setTravelers(List<BookingSearchViewTraveler> travelers) {
		this.travelers = travelers;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getAgencyName() {
		return agencyName;
	}
	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}
	public List<String> getMarketingCarriers() {
		return marketingCarriers;
	}
	public void setMarketingCarriers(List<String> marketingCarriers) {
		this.marketingCarriers = marketingCarriers;
	}
	public String getMeanOfPayment() {
		return meanOfPayment;
	}
	public void setMeanOfPayment(String meanOfPayment) {
		this.meanOfPayment = meanOfPayment;
	}
	public List<String> getSupplierReferences() {
		return supplierReferences;
	}
	public void setSupplierReferences(List<String> supplierReferences) {
		this.supplierReferences = supplierReferences;
	}
	
}
