package com.controller.helper.booking;

import java.util.List;

import com.controller.helper.Contact;
import com.controller.helper.ResourceError;

public class Booking {
	String id;
	List<AfterSalesOperation> afterSalesOperations;
	String agencyBookingReference;
	List<Billing> billings;
	List<PointToPointBookingItem> bookingItems; // List<PassBookingItem>,
	String bookingReference;
	String bookingStatus;
	Contact contact;
	String creationDate;
	List<Email> emails;
	String expirationDate;
	String holdDistributorTTLDate;
	String lastStatusModificationTime;
	String lastStatusModifiedBy;
	Selling selling;
	String overviewStatus;
	List<Payment> payments;
	PointOfSale pointOfSale;
	List<BookingStatusChange> statusChanges;
	BookingPrices prices;
	BookingPrices invoicedPrices;
	Boolean billingDocumentsEligibility;
	BillingDocuments billingDocuments;
	List<ResourceError> errors;
	List<ResourceError> warnings;
List<FareOffer>fareOffer;
	@Override
	public String toString() {
		return "{id:\"" + id + "\", afterSalesOperations:[" + afterSalesOperations + "], agencyBookingReference:\""
				+ agencyBookingReference + "\", bookingItems:[" + bookingItems + "], bookingReference:\"" + bookingReference
				+ "\", bookingStatus:\"" + bookingStatus + "\",contact:"+contact+", creationDate:\"" + creationDate + "\","
						+ "emails:["+emails+"], expirationDate:\""
				+ expirationDate + "\", holdDistributorTTLDate:\"" + holdDistributorTTLDate
				+ "\", lastStatusModificationTime:\"" + lastStatusModificationTime + "\", lastStatusModifiedBy:\""
				+ lastStatusModifiedBy + "\", overviewStatus:\"" + overviewStatus + "\",payments:["+payments+"], billingDocumentsEligibility:\""
				+ billingDocumentsEligibility + "\",statusChanges:["+statusChanges+"],prices:"+prices+",invoicedPrices:"+invoicedPrices+
				",billingDocuments:"+billingDocuments+",billings:["+billings+"}";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<AfterSalesOperation> getAfterSalesOperations() {
		return afterSalesOperations;
	}

	public void setAfterSalesOperations(List<AfterSalesOperation> afterSalesOperations) {
		this.afterSalesOperations = afterSalesOperations;
	}

	public String getAgencyBookingReference() {
		return agencyBookingReference;
	}

	public void setAgencyBookingReference(String agencyBookingReference) {
		this.agencyBookingReference = agencyBookingReference;
	}

	public List<Billing> getBillings() {
		return billings;
	}

	public void setBillings(List<Billing> billings) {
		this.billings = billings;
	}

	

	public List<PointToPointBookingItem> getBookingItems() {
		return bookingItems;
	}

	public void setBookingItems(List<PointToPointBookingItem> bookingItems) {
		this.bookingItems = bookingItems;
	}

	public String getBookingReference() {
		return bookingReference;
	}

	public void setBookingReference(String bookingReference) {
		this.bookingReference = bookingReference;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public List<Email> getEmails() {
		return emails;
	}

	public void setEmails(List<Email> emails) {
		this.emails = emails;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getHoldDistributorTTLDate() {
		return holdDistributorTTLDate;
	}

	public void setHoldDistributorTTLDate(String holdDistributorTTLDate) {
		this.holdDistributorTTLDate = holdDistributorTTLDate;
	}

	public String getLastStatusModificationTime() {
		return lastStatusModificationTime;
	}

	public void setLastStatusModificationTime(String lastStatusModificationTime) {
		this.lastStatusModificationTime = lastStatusModificationTime;
	}

	public String getLastStatusModifiedBy() {
		return lastStatusModifiedBy;
	}

	public void setLastStatusModifiedBy(String lastStatusModifiedBy) {
		this.lastStatusModifiedBy = lastStatusModifiedBy;
	}

	public String getOverviewStatus() {
		return overviewStatus;
	}

	public void setOverviewStatus(String overviewStatus) {
		this.overviewStatus = overviewStatus;
	}

	public List<Payment> getPayments() {
		return payments;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

	public PointOfSale getPointOfSale() {
		return pointOfSale;
	}

	public void setPointOfSale(PointOfSale pointOfSale) {
		this.pointOfSale = pointOfSale;
	}

	public List<BookingStatusChange> getStatusChanges() {
		return statusChanges;
	}

	public void setStatusChanges(List<BookingStatusChange> statusChanges) {
		this.statusChanges = statusChanges;
	}

	public BookingPrices getPrices() {
		return prices;
	}

	public void setPrices(BookingPrices prices) {
		this.prices = prices;
	}

	public BookingPrices getInvoicedPrices() {
		return invoicedPrices;
	}

	public void setInvoicedPrices(BookingPrices invoicedPrices) {
		this.invoicedPrices = invoicedPrices;
	}

	public Boolean getBillingDocumentsEligibility() {
		return billingDocumentsEligibility;
	}

	public void setBillingDocumentsEligibility(Boolean billingDocumentsEligibility) {
		this.billingDocumentsEligibility = billingDocumentsEligibility;
	}

	public BillingDocuments getBillingDocuments() {
		return billingDocuments;
	}

	public void setBillingDocuments(BillingDocuments billingDocuments) {
		this.billingDocuments = billingDocuments;
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

	public Selling getSelling() {
		return selling;
	}

	public void setSelling(Selling selling) {
		this.selling = selling;
	}

	public List<FareOffer> getFareOffer() {
		return fareOffer;
	}

	public void setFareOffer(List<FareOffer> fareOffer) {
		this.fareOffer = fareOffer;
	}

}
