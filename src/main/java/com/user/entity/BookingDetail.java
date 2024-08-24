package com.user.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "BookingDetail")
public class BookingDetail {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	String appProvider;
	Long userId;
	String bookingId;
	String bookingStatus;
	String bookingReference;
	String bookingDetails;
	Date createDate;
	Long siteId;
	String pnr;
	Date expirationDate;
	Integer totalTravelers;
	String totalTravelersDetails;
	Date firstDateOfTravel;
	Double ticketPrice;
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
	
	public String getBookingDetails() {
		return bookingDetails;
	}
	public void setBookingDetails(String bookingDetails) {
		this.bookingDetails = bookingDetails;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	public Long getSiteId() {
		return siteId;
	}
	public void setSiteId(Long siteId) {
		this.siteId = siteId;
	}
	public String getPnr() {
		return pnr;
	}
	public void setPnr(String pnr) {
		this.pnr = pnr;
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
	public String getTotalTravelersDetails() {
		return totalTravelersDetails;
	}
	public void setTotalTravelersDetails(String totalTravelersDetails) {
		this.totalTravelersDetails = totalTravelersDetails;
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
	@Override
	public String toString() {
		return "BookingDetail [id=" + id + ", appProvider=" + appProvider + ", userId=" + userId + ", bookingId="
				+ bookingId + ", bookingStatus=" + bookingStatus + ", bookingReference=" + bookingReference
				+ ", bookingDetails=" + bookingDetails + ", createDate=" + createDate + ", siteId=" + siteId + ", pnr="
				+ pnr + ", expirationDate=" + expirationDate + ", totalTravelers=" + totalTravelers
				+ ", totalTravelersDetails=" + totalTravelersDetails + ", firstDateOfTravel=" + firstDateOfTravel
				+ ", ticketPrice=" + ticketPrice + "]";
	}
	
}
