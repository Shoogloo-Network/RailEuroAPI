package com.controller.helper.booking;

public class Ticket {
	String fareOffer;
	String productAssignment;
	String ticketNumber;
	Boolean isFictive;
	public String getFareOffer() {
		return fareOffer;
	}
	public void setFareOffer(String fareOffer) {
		this.fareOffer = fareOffer;
	}
	public String getProductAssignment() {
		return productAssignment;
	}
	public void setProductAssignment(String productAssignment) {
		this.productAssignment = productAssignment;
	}
	public String getTicketNumber() {
		return ticketNumber;
	}
	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	public Boolean getIsFictive() {
		return isFictive;
	}
	public void setIsFictive(Boolean isFictive) {
		this.isFictive = isFictive;
	}
	@Override
	public String toString() {
		return "Ticket [fareOffer=" + fareOffer + ", productAssignment=" + productAssignment + ", ticketNumber="
				+ ticketNumber + ", isFictive=" + isFictive + "]";
	}
	
}
