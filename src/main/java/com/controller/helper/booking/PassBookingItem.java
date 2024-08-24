package com.controller.helper.booking;

import java.util.List;

import com.controller.helper.ResourceError;
import com.controller.helper.passesoffer.PassCondition;

public class PassBookingItem {
String id;
List<PassCondition>	conditions;
List<PassProductAssignment>productAssignments;
List<PassProduct>	products;
List<String>tags;	
PassTravelClass	travelClass;
Number numberOfTravelDays;		
String validityDuration;
String activationDuration;
String paymentId;		
String label;									
PassPeriod validityPeriod;				
PassPeriod		activationPeriod;						
List<MobileReference> mobileReferences;							
List<ResourceError>errors;
List<ResourceError>warnings;
String bookingItemStatus;
List<String>offerLocations;
BookingItemCancellationEligibility cancelationEligibility;

String expirationDate;
SupplierOrder supplierOrder;
List<TicketingOption>ticketingOptions;
String type;
List<ValueDocument>valueDocuments;
List<BookingTraveler>bookingTravelers;
TicketingOption ticketingOptionSelected;
TravelerInformationRequired travelerInformationRequired;
List<Ticket>tickets;

Prices prices;
String itemExchangedFrom;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public List<PassCondition> getConditions() {
	return conditions;
}
public void setConditions(List<PassCondition> conditions) {
	this.conditions = conditions;
}
public List<PassProductAssignment> getProductAssignments() {
	return productAssignments;
}
public void setProductAssignments(List<PassProductAssignment> productAssignments) {
	this.productAssignments = productAssignments;
}
public List<PassProduct> getProducts() {
	return products;
}
public void setProducts(List<PassProduct> products) {
	this.products = products;
}
public List<String> getTags() {
	return tags;
}
public void setTags(List<String> tags) {
	this.tags = tags;
}
public PassTravelClass getTravelClass() {
	return travelClass;
}
public void setTravelClass(PassTravelClass travelClass) {
	this.travelClass = travelClass;
}
public Number getNumberOfTravelDays() {
	return numberOfTravelDays;
}
public void setNumberOfTravelDays(Number numberOfTravelDays) {
	this.numberOfTravelDays = numberOfTravelDays;
}
public String getValidityDuration() {
	return validityDuration;
}
public void setValidityDuration(String validityDuration) {
	this.validityDuration = validityDuration;
}
public String getActivationDuration() {
	return activationDuration;
}
public void setActivationDuration(String activationDuration) {
	this.activationDuration = activationDuration;
}
public String getPaymentId() {
	return paymentId;
}
public void setPaymentId(String paymentId) {
	this.paymentId = paymentId;
}
public String getLabel() {
	return label;
}
public void setLabel(String label) {
	this.label = label;
}
public PassPeriod getValidityPeriod() {
	return validityPeriod;
}
public void setValidityPeriod(PassPeriod validityPeriod) {
	this.validityPeriod = validityPeriod;
}
public PassPeriod getActivationPeriod() {
	return activationPeriod;
}
public void setActivationPeriod(PassPeriod activationPeriod) {
	this.activationPeriod = activationPeriod;
}
public List<MobileReference> getMobileReferences() {
	return mobileReferences;
}
public void setMobileReferences(List<MobileReference> mobileReferences) {
	this.mobileReferences = mobileReferences;
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
	return "PassBookingItem [id=" + id + ", conditions=" + conditions + ", products=" + products + ", tags=" + tags
			+ ", travelClass=" + travelClass + ", numberOfTravelDays=" + numberOfTravelDays + ", validityDuration="
			+ validityDuration + ", activationDuration=" + activationDuration + ", paymentId=" + paymentId + ", label="
			+ label + ", validityPeriod=" + validityPeriod + ", activationPeriod=" + activationPeriod + ", errors="
			+ errors + ", warnings=" + warnings + ", bookingItemStatus=" + bookingItemStatus + ", offerLocations="
			+ offerLocations + ", cancelationEligibility=" + cancelationEligibility + ", expirationDate="
			+ expirationDate + ", supplierOrder=" + supplierOrder + ", ticketingOptions=" + ticketingOptions + ", type="
			+ type + ", valueDocuments=" + valueDocuments + ", bookingTravelers=" + bookingTravelers
			+ ", ticketingOptionSelected=" + ticketingOptionSelected + ", travelerInformationRequired="
			+ travelerInformationRequired + ", tickets=" + tickets + ", prices=" + prices + ", itemExchangedFrom="
			+ itemExchangedFrom + "]";
}
								
}
