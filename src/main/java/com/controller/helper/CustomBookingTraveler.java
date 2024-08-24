package com.controller.helper;

import java.util.List;
import java.util.Map;

import com.controller.helper.booking.BookingTraveler;

public class CustomBookingTraveler {
String bookingItemId;
List<BookingTraveler> travelers;




public String getBookingItemId() {
	return bookingItemId;
}
public void setBookingItemId(String bookingItemId) {
	this.bookingItemId = bookingItemId;
}
public List<BookingTraveler> getTravelers() {
	return travelers;
}
public void setTravelers(List<BookingTraveler> travelers) {
	this.travelers = travelers;
}


}
