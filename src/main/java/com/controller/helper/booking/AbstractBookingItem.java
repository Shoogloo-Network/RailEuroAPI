package com.controller.helper.booking;

import java.util.List;

import com.controller.helper.ResourceError;

public class AbstractBookingItem {
	String id;

	List<ResourceError> errors;
	List<ResourceError> warnings;
	String bookingItemStatus;
	List<String> offerLocations;
	BookingItemCancellationEligibility cancelationEligibility;
	String expirationDate;
	SupplierOrder supplierOrder;
	List<TicketingOption> ticketingOptions;
	String type;
	List<ValueDocument> valueDocuments;
	List<BookingTraveler> bookingTravelers;
	TicketingOption ticketingOptionSelected;
	TravelerInformationRequired travelerInformationRequired;
	List<Ticket> tickets;
	Prices prices;
	String itemExchangedFrom;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<ResourceError> getErrors() {
		return errors;
	}
	public void setErrors(List<ResourceError> errors) {
		this.errors = errors;
	}
	public List<ResourceError> getWarnings() {
		return warnings;
	}
	public void setWarnings(List<ResourceError> warnings) {
		this.warnings = warnings;
	}
	public String getBookingItemStatus() {
		return bookingItemStatus;
	}
	public void setBookingItemStatus(String bookingItemStatus) {
		this.bookingItemStatus = bookingItemStatus;
	}
	public List<String> getOfferLocations() {
		return offerLocations;
	}
	public void setOfferLocations(List<String> offerLocations) {
		this.offerLocations = offerLocations;
	}
	public BookingItemCancellationEligibility getCancelationEligibility() {
		return cancelationEligibility;
	}
	public void setCancelationEligibility(BookingItemCancellationEligibility cancelationEligibility) {
		this.cancelationEligibility = cancelationEligibility;
	}
	public String getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	public SupplierOrder getSupplierOrder() {
		return supplierOrder;
	}
	public void setSupplierOrder(SupplierOrder supplierOrder) {
		this.supplierOrder = supplierOrder;
	}
	public List<TicketingOption> getTicketingOptions() {
		return ticketingOptions;
	}
	public void setTicketingOptions(List<TicketingOption> ticketingOptions) {
		this.ticketingOptions = ticketingOptions;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<ValueDocument> getValueDocuments() {
		return valueDocuments;
	}
	public void setValueDocuments(List<ValueDocument> valueDocuments) {
		this.valueDocuments = valueDocuments;
	}
	public List<BookingTraveler> getBookingTravelers() {
		return bookingTravelers;
	}
	public void setBookingTravelers(List<BookingTraveler> bookingTravelers) {
		this.bookingTravelers = bookingTravelers;
	}
	public TicketingOption getTicketingOptionSelected() {
		return ticketingOptionSelected;
	}
	public void setTicketingOptionSelected(TicketingOption ticketingOptionSelected) {
		this.ticketingOptionSelected = ticketingOptionSelected;
	}
	public TravelerInformationRequired getTravelerInformationRequired() {
		return travelerInformationRequired;
	}
	public void setTravelerInformationRequired(TravelerInformationRequired travelerInformationRequired) {
		this.travelerInformationRequired = travelerInformationRequired;
	}
	public List<Ticket> getTickets() {
		return tickets;
	}
	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}
	public Prices getPrices() {
		return prices;
	}
	public void setPrices(Prices prices) {
		this.prices = prices;
	}
	public String getItemExchangedFrom() {
		return itemExchangedFrom;
	}
	public void setItemExchangedFrom(String itemExchangedFrom) {
		this.itemExchangedFrom = itemExchangedFrom;
	}
	@Override
	public String toString() {
		return "AbstractBookingItem [id=" + id + ", errors=" + errors + ", warnings=" + warnings
				+ ", bookingItemStatus=" + bookingItemStatus + ", offerLocations=" + offerLocations
				+ ", cancelationEligibility=" + cancelationEligibility + ", expirationDate=" + expirationDate
				+ ", supplierOrder=" + supplierOrder + ", ticketingOptions=" + ticketingOptions + ", type=" + type
				+ ", valueDocuments=" + valueDocuments + ", bookingTravelers=" + bookingTravelers
				+ ", ticketingOptionSelected=" + ticketingOptionSelected + ", travelerInformationRequired="
				+ travelerInformationRequired + ", tickets=" + tickets + ", prices=" + prices + ", itemExchangedFrom="
				+ itemExchangedFrom + "]";
	}

}
