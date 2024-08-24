package com.user.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "razorpay")

public class Razorpay {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	Long id;
	Long userId;
	String razorpayOrderId;
	String razorpayPaymentId;
	Long	siteId;
	String razorpaySignature;
	Date currDate=new Date();
	Integer status;
	String railBookingId;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getRazorpayOrderId() {
		return razorpayOrderId;
	}
	public void setRazorpayOrderId(String razorpayOrderId) {
		this.razorpayOrderId = razorpayOrderId;
	}
	public String getRazorpayPaymentId() {
		return razorpayPaymentId;
	}
	public void setRazorpayPaymentId(String razorpayPaymentId) {
		this.razorpayPaymentId = razorpayPaymentId;
	}
	public Long getSiteId() {
		return siteId;
	}
	public void setSiteId(Long siteId) {
		this.siteId = siteId;
	}
	public String getRazorpaySignature() {
		return razorpaySignature;
	}
	public void setRazorpaySignature(String razorpaySignature) {
		this.razorpaySignature = razorpaySignature;
	}
	public Date getCurrDate() {
		return currDate;
	}
	public void setCurrDate(Date currDate) {
		this.currDate = currDate;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Razorpay [id=" + id + ", userId=" + userId + ", razorpayOrderId=" + razorpayOrderId
				+ ", razorpayPaymentId=" + razorpayPaymentId + ", siteId=" + siteId + ", razorpaySignature="
				+ razorpaySignature + ", currDate=" + currDate + ", status=" + status + "]";
	}
	public String getRailBookingId() {
		return railBookingId;
	}
	public void setRailBookingId(String railBookingId) {
		this.railBookingId = railBookingId;
	}
	
	
}
