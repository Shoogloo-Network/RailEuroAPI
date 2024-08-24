package com.controller.helper;

import java.util.List;

import com.controller.helper.booking.BookingTraveler;

public class CustomBookingTravelerHead {
List<CustomBookingTraveler> booking;

public List<CustomBookingTraveler> getBooking() {
	return booking;
}

public void setBooking(List<CustomBookingTraveler> booking) {
	this.booking = booking;
}

@Override
public String toString() {
	return "CustomBookingTravelerHead [booking=" + booking + "]";
}


}
