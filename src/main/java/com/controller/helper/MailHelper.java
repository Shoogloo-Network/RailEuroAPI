package com.controller.helper;

import java.util.List;

import com.controller.helper.booking.ValueDocument;
import com.user.entity.MailsDataAttachment;

public class MailHelper {
	
	
	String bookingReference ;
	String origin;
	String destination;
	String name;
	String departure;
	String arrival;
	String pnr;
	Number amount;
	Number totalamount;
	Number partnerComission;
	Number refund;
	String toSendMail;
	String ticketumber;
	List<ValueDocument> attachmentUrl;
	List<String> ctr ;
	public String getBookingReference() {
		return bookingReference;
	}
	public void setBookingReference(String bookingReference) {
		this.bookingReference = bookingReference;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public String getPnr() {
		return pnr;
	}
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}
	
	public Number getAmount() {
		return amount;
	}
	public void setAmount(Number amount) {
		this.amount = amount;
	}
	
	public Number getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(Number totalamount) {
		this.totalamount = totalamount;
	}
	public Number getPartnerComission() {
		return partnerComission;
	}
	public void setPartnerComission(Number partnerComission) {
		this.partnerComission = partnerComission;
	}
	public Number getRefund() {
		return refund;
	}
	public void setRefund(Number refund) {
		this.refund = refund;
	}
	
	public String getToSendMail() {
		return toSendMail;
	}
	public void setToSendMail(String toSendMail) {
		this.toSendMail = toSendMail;
	}
	
	public String getTicketumber() {
		return ticketumber;
	}
	public void setTicketumber(String ticketumber) {
		this.ticketumber = ticketumber;
	}
	public List<String> getCtr() {
		return ctr;
	}
	public void setCtr(List<String> ctr) {
		this.ctr = ctr;
	}
	public List<ValueDocument> getAttachmentUrl() {
		return attachmentUrl;
	}
	public void setAttachmentUrl(List<ValueDocument> attachmentUrl) {
		this.attachmentUrl = attachmentUrl;
	}
	@Override
	public String toString() {
		return "MailHelper [bookingReference=" + bookingReference + ", origin=" + origin + ", destination="
				+ destination + ", name=" + name + ", departure=" + departure + ", arrival=" + arrival + ", pnr=" + pnr
				+ ", amount=" + amount + ", totalamount=" + totalamount + ", partnerComission=" + partnerComission
				+ ", refund=" + refund + ", toSendMail=" + toSendMail + ", ticketumber=" + ticketumber
				+ ", attachmentUrl=" + attachmentUrl + "]";
	}
	
}
