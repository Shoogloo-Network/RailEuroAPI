package com.controller.helper.booking;

import com.controller.helper.Contact;

public class BookingView {
	String id;
	String bookingStatus;
	String bookingReference;
	String agencyBookingReference;
	Contact contact;
	TotalPrice totalPrice;
	@Override
	public String toString() {
		return "BookingView [id=" + id + ", bookingStatus=" + bookingStatus + ", bookingReference=" + bookingReference
				+ ", agencyBookingReference=" + agencyBookingReference + "]";
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
	
}