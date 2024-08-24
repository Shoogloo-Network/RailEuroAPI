package com.controller.helper.booking;

import java.util.List;
public class CreateBookingRequest {
	List<CreateBookingRequestItem> items;

	public List<CreateBookingRequestItem> getItems() {
		return items;
	}

	public void setItems(List<CreateBookingRequestItem> items) {
		this.items = items;
	}

	

	@Override
	public String toString() {
		return "CreateBookingRequest [items=" + items;
	}


}
