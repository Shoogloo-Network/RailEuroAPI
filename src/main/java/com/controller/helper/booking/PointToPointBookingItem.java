package com.controller.helper.booking;

import java.util.List;

import com.controller.helper.ResourceError;

public class PointToPointBookingItem {
	String id;
	// array (oneOf) [PointToPointProduct]array (oneOf) [AbstractProduct]array
	// (oneOf) [PointToPointOptionProduct]

	List<Object> products;

	List<Leg> legs;
	List<FareOffer> fareOffers;
	List<Service> services;
	List<ServiceOffer> serviceOffers;
	List<Accommodation> accomodations;
	List<String> ticketsCollectionReferences;
	EditTravelersEligibility editTravelersEligibility;
	List<ResourceError> errors;
	List<ResourceError> warnings;
	String bookingItemStatus;
	List<String> offerLocations;
	BookingItemCancellationEligibility cancelationEligibility;
	String expirationDate;
	SupplierOrder supplierOrder;
	List<TicketingOption> ticketingOptions;
	String status;
	List<ValueDocument> valueDocuments;
	List<BookingTraveler> bookingTravelers;
	List<BookingTraveler> travelers;
	TicketingOption ticketingOptionSelected;
	TravelerInformationRequired travelerInformationRequired;
	List<Ticket> tickets;
	Prices prices;
	String itemExchangedFrom;

	@Override
	public String toString() {
		return "{id:\"" + id + "\", products:\"" + products + "\", legs:\"" + legs + "\", fareOffers:\""
				+ fareOffers + "\", services:\"" + services + "\", serviceOffers=" + serviceOffers
				+ ", ticketsCollectionReferences=" + ticketsCollectionReferences + ", errors=" + errors + ", warnings="
				+ warnings + ", bookingItemStatus=" + bookingItemStatus + ", offerLocations=" + offerLocations
				+ ", cancelationEligibility=" + cancelationEligibility + ", expirationDate=" + expirationDate
				+ ", supplierOrder=" + supplierOrder + ", ticketingOptions=" + ticketingOptions + ", status=" + status
				+ ", valueDocuments=" + valueDocuments + ", travelers=" + travelers
				+ ", ticketingOptionSelected=" + ticketingOptionSelected + ", travelerInformationRequired="
				+ travelerInformationRequired + ", tickets=" + tickets + ", prices=" + prices + ", itemExchangedFrom="
				+ itemExchangedFrom + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Object> getProducts() {
		return products;
	}

	public void setProducts(List<Object> products) {
		this.products = products;
	}

	public List<Leg> getLegs() {
		return legs;
	}

	public void setLegs(List<Leg> legs) {
		this.legs = legs;
	}

	public List<FareOffer> getFareOffers() {
		return fareOffers;
	}

	public void setFareOffers(List<FareOffer> fareOffers) {
		this.fareOffers = fareOffers;
	}

	public List<Service> getServices() {
		return services;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}

	public List<ServiceOffer> getServiceOffers() {
		return serviceOffers;
	}

	public void setServiceOffers(List<ServiceOffer> serviceOffers) {
		this.serviceOffers = serviceOffers;
	}

	public List<Accommodation> getAccomodations() {
		return accomodations;
	}

	public void setAccomodations(List<Accommodation> accomodations) {
		this.accomodations = accomodations;
	}

	public List<String> getTicketsCollectionReferences() {
		return ticketsCollectionReferences;
	}

	public void setTicketsCollectionReferences(List<String> ticketsCollectionReferences) {
		this.ticketsCollectionReferences = ticketsCollectionReferences;
	}

	public EditTravelersEligibility getEditTravelersEligibility() {
		return editTravelersEligibility;
	}

	public void setEditTravelersEligibility(EditTravelersEligibility editTravelersEligibility) {
		this.editTravelersEligibility = editTravelersEligibility;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public List<BookingTraveler> getTravelers() {
		return travelers;
	}

	public void setTravelers(List<BookingTraveler> travelers) {
		this.travelers = travelers;
	}

}
