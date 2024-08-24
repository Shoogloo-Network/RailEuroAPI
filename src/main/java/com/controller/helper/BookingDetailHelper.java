package com.controller.helper;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.controller.helper.booking.Booking;
import com.controller.helper.booking.BookingTraveler;

public class BookingDetailHelper {
	
	private Long id;
	String appProvider;
	Long userId;
	String bookingId;
	String bookingStatus;
	String bookingReference;
	Booking bookingDetails;
	Date createDate;
	Long siteId;
	Date expirationDate;
	Integer totalTravelers;
	Date firstDateOfTravel;
	Double ticketPrice;

	Boolean expired;
	CustomBookingTravelerHead travelers;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAppProvider() {
		return appProvider;
	}
	public void setAppProvider(String appProvider) {
		this.appProvider = appProvider;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getBookingId() {
		return bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	public String getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	public String getBookingReference() {
		return bookingReference;
	}
	public void setBookingReference(String bookingReference) {
		this.bookingReference = bookingReference;
	}
	
	public Booking getBookingDetails() {
		return bookingDetails;
	}
	public void setBookingDetails(Booking bookingDetails) {
		this.bookingDetails = bookingDetails;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	@Override
	public String toString() {
		return "BookingDetailHelper [id=" + id + ", appProvider=" + appProvider + ", userId=" + userId + ", bookingId="
				+ bookingId + ", bookingStatus=" + bookingStatus + ", bookingReference=" + bookingReference
				+ ", bookingDetails=" + bookingDetails + ", createDate=" + createDate + ", siteId=" + siteId
				+ ", expirationDate=" + expirationDate + ", totalTravelers=" + totalTravelers + ", firstDateOfTravel="
				+ firstDateOfTravel + ", ticketPrice=" + ticketPrice + "]";
	}
	public Long getSiteId() {
		return siteId;
	}
	public void setSiteId(Long siteId) {
		this.siteId = siteId;
	}
	public Date getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
	public Integer getTotalTravelers() {
		return totalTravelers;
	}
	public void setTotalTravelers(Integer totalTravelers) {
		this.totalTravelers = totalTravelers;
	}
	public Date getFirstDateOfTravel() {
		return firstDateOfTravel;
	}
	public void setFirstDateOfTravel(Date firstDateOfTravel) {
		this.firstDateOfTravel = firstDateOfTravel;
	}
	public Double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(Double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public CustomBookingTravelerHead getTravelers() {
		return travelers;
	}
	public void setTravelers(CustomBookingTravelerHead travelers) {
		this.travelers = travelers;
	}
	
	public Boolean getExpired() {
		return expired;
	}
	public void setExpired(Boolean expired) {
		this.expired = expired;
	}
	
	
	
	
	
}
