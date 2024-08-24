package com.controller.helper.booking;

import java.util.List;

public class Payment {
	Amount amount;
	String paymentStatus;
	List<PaymentTransaction> paymentTransactions;
	String merchantReference;
	String paymentRedirectionUri;
	String id;
	PaymentMethod paymentMethod;
	List<String> afterSalesOperationIds;

	@Override
	public String toString() {
		return "Payment [paymentStatus=" + paymentStatus + ", merchantReference=" + merchantReference
				+ ", paymentRedirectionUri=" + paymentRedirectionUri + ", id=" + id + ", afterSalesOperationIds="
				+ afterSalesOperationIds + "]";
	}

	public Amount getAmount() {
		return amount;
	}

	public void setAmount(Amount amount) {
		this.amount = amount;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public List<PaymentTransaction> getPaymentTransactions() {
		return paymentTransactions;
	}

	public void setPaymentTransactions(List<PaymentTransaction> paymentTransactions) {
		this.paymentTransactions = paymentTransactions;
	}

	public String getMerchantReference() {
		return merchantReference;
	}

	public void setMerchantReference(String merchantReference) {
		this.merchantReference = merchantReference;
	}

	public String getPaymentRedirectionUri() {
		return paymentRedirectionUri;
	}

	public void setPaymentRedirectionUri(String paymentRedirectionUri) {
		this.paymentRedirectionUri = paymentRedirectionUri;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public List<String> getAfterSalesOperationIds() {
		return afterSalesOperationIds;
	}

	public void setAfterSalesOperationIds(List<String> afterSalesOperationIds) {
		this.afterSalesOperationIds = afterSalesOperationIds;
	}

}
