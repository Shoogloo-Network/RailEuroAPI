package com.controller.helper.booking;

public class BookingStatusChange {
	String date;
	String pointOfSale;
	String status;
	String modifiedBy;
	String modifiedByClientId;
	@Override
	public String toString() {
		return "BookingStatusChange [date=" + date + ", pointOfSale=" + pointOfSale + ", status=" + status
				+ ", modifiedBy=" + modifiedBy + ", modifiedByClientId=" + modifiedByClientId + "]";
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPointOfSale() {
		return pointOfSale;
	}
	public void setPointOfSale(String pointOfSale) {
		this.pointOfSale = pointOfSale;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public String getModifiedByClientId() {
		return modifiedByClientId;
	}
	public void setModifiedByClientId(String modifiedByClientId) {
		this.modifiedByClientId = modifiedByClientId;
	}
}
