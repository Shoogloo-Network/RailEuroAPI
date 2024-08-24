package com.controller.helper.booking;

import java.util.List;

public class FareOfferPrices {
	Prices ticket;

	Prices reservation;
	List<Billing> billings;
	Selling selling;
	public Prices getTicket() {
		return ticket;
	}
	public void setTicket(Prices ticket) {
		this.ticket = ticket;
	}
	public Prices getReservation() {
		return reservation;
	}
	public void setReservation(Prices reservation) {
		this.reservation = reservation;
	}
	public List<Billing> getBillings() {
		return billings;
	}
	public void setBillings(List<Billing> billings) {
		this.billings = billings;
	}
	public Selling getSelling() {
		return selling;
	}
	public void setSelling(Selling selling) {
		this.selling = selling;
	}
	@Override
	public String toString() {
		return "FareOfferPrices [ticket=" + ticket + ", reservation=" + reservation + ", billings=" + billings
				+ ", selling=" + selling + "]";
	}
	
	
}
