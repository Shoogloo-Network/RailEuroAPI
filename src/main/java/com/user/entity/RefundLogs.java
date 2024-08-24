package com.user.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "RefundLog")
public class RefundLogs {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	String bookingId;

	String refundOperationId;
	String type;
	
	String status;
	Double  balancePrice;
	String  balanceCurrency;
	Double reversedPrices;
	String reversedCurrency;
	String operationDateTime;
	String expirationDate;
	String refundType;
	String 	pgstatus;
	Date createDate;
	String json;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBookingId() {
		return bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	public String getRefundOperationId() {
		return refundOperationId;
	}
	public void setRefundOperationId(String refundOperationId) {
		this.refundOperationId = refundOperationId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Double getBalancePrice() {
		return balancePrice;
	}
	public void setBalancePrice(Double balancePrice) {
		this.balancePrice = balancePrice;
	}
	public String getBalanceCurrency() {
		return balanceCurrency;
	}
	public void setBalanceCurrency(String balanceCurrency) {
		this.balanceCurrency = balanceCurrency;
	}
	public Double getReversedPrices() {
		return reversedPrices;
	}
	public void setReversedPrices(Double reversedPrices) {
		this.reversedPrices = reversedPrices;
	}
	public String getReversedCurrency() {
		return reversedCurrency;
	}
	public void setReversedCurrency(String reversedCurrency) {
		this.reversedCurrency = reversedCurrency;
	}
	public String getOperationDateTime() {
		return operationDateTime;
	}
	public void setOperationDateTime(String operationDateTime) {
		this.operationDateTime = operationDateTime;
	}
	public String getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	public String getRefundType() {
		return refundType;
	}
	public void setRefundType(String refundType) {
		this.refundType = refundType;
	}
	public String getPgstatus() {
		return pgstatus;
	}
	public void setPgstatus(String pgstatus) {
		this.pgstatus = pgstatus;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getJson() {
		return json;
	}
	public void setJson(String json) {
		this.json = json;
	}
	@Override
	public String toString() {
		return "RefundLogs [id=" + id + ", bookingId=" + bookingId + ", refundOperationId=" + refundOperationId
				+ ", type=" + type + ", status=" + status + ", balancePrice=" + balancePrice + ", balanceCurrency="
				+ balanceCurrency + ", reversedPrices=" + reversedPrices + ", reversedCurrency=" + reversedCurrency
				+ ", operationDateTime=" + operationDateTime + ", expirationDate=" + expirationDate + ", refundType="
				+ refundType + ", pgstatus=" + pgstatus + ", createDate=" + createDate + ", json=" + json + "]";
	}
	
	
	
}
