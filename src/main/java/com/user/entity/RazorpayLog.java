package com.user.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "razorpaylog")

public class RazorpayLog {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	Long id;
	Long razorpayId;
	Long userId;
	String razorpay_order_id;
	String razorpay_payment_id;
	Long	siteId;
	String razorpay_signature;
	Date currDate;
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
	public String getRazorpay_order_id() {
		return razorpay_order_id;
	}
	public void setRazorpay_order_id(String razorpay_order_id) {
		this.razorpay_order_id = razorpay_order_id;
	}
	public String getRazorpay_payment_id() {
		return razorpay_payment_id;
	}
	public void setRazorpay_payment_id(String razorpay_payment_id) {
		this.razorpay_payment_id = razorpay_payment_id;
	}
	public Long getSiteId() {
		return siteId;
	}
	public void setSiteId(Long siteId) {
		this.siteId = siteId;
	}
	public String getRazorpay_signature() {
		return razorpay_signature;
	}
	public void setRazorpay_signature(String razorpay_signature) {
		this.razorpay_signature = razorpay_signature;
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
		return "razorpay [id=" + id + ", userId=" + userId + ", razorpay_order_id=" + razorpay_order_id
				+ ", razorpay_payment_id=" + razorpay_payment_id + ", siteId=" + siteId + ", razorpay_signature="
				+ razorpay_signature + ", currDate=" + currDate + ", status=" + status + "]";
	}
	public Long getRazorpayId() {
		return razorpayId;
	}
	public void setRazorpayId(Long razorpayId) {
		this.razorpayId = razorpayId;
	}
	public String getRailBookingId() {
		return railBookingId;
	}
	public void setRailBookingId(String railBookingId) {
		this.railBookingId = railBookingId;
	}
	
}
