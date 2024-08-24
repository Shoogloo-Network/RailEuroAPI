package com.user.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "payments")

public class Payments {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	Long id;
	Long userId;
	String bookingId;
	Long	siteId;
	Double amount;
	Double discount;
	String currency;
	String paymentStatus;
	String order_id;
	String phoneNo;
	String shipping_address;
	Date createDate;
	String tracking_id;
	String bank_ref_no;
	String order_status;
	String failure_message;
	String 	payment_mode;
	String card_name;
	String status_code;
	String status_message;
	String 	billing_name;
	String billing_address;
	String billing_city;
	String billing_state;
	String billing_zip;
	String billing_country;
	String billing_tel;
	String billing_email;
	String delivery_name;
	String delivery_address;
	String delivery_city;
	String delivery_state;
	String delivery_zip;
	String delivery_country;
	String delivery_tel;
	String merchant_param1;
	String merchant_param2;
	String 	merchant_param3;
	String merchant_param4;
	String merchant_param5;
	String vault;
	String offer_type;
	String offer_code;
	Double discount_value;
	Double mer_amount;
	String 	eci_value;
	String retry;
	String 	response_code;
	String trans_date;
	String	billing_notes;
	String	bin_country;
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
	public String getBookingId() {
		return bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	public Long getSiteId() {
		return siteId;
	}
	public void setSiteId(Long siteId) {
		this.siteId = siteId;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getShipping_address() {
		return shipping_address;
	}
	public void setShipping_address(String shipping_address) {
		this.shipping_address = shipping_address;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getTracking_id() {
		return tracking_id;
	}
	public void setTracking_id(String tracking_id) {
		this.tracking_id = tracking_id;
	}
	public String getBank_ref_no() {
		return bank_ref_no;
	}
	public void setBank_ref_no(String bank_ref_no) {
		this.bank_ref_no = bank_ref_no;
	}
	public String getOrder_status() {
		return order_status;
	}
	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}
	public String getFailure_message() {
		return failure_message;
	}
	public void setFailure_message(String failure_message) {
		this.failure_message = failure_message;
	}
	public String getPayment_mode() {
		return payment_mode;
	}
	public void setPayment_mode(String payment_mode) {
		this.payment_mode = payment_mode;
	}
	public String getCard_name() {
		return card_name;
	}
	public void setCard_name(String card_name) {
		this.card_name = card_name;
	}
	public String getStatus_code() {
		return status_code;
	}
	public void setStatus_code(String status_code) {
		this.status_code = status_code;
	}
	public String getStatus_message() {
		return status_message;
	}
	public void setStatus_message(String status_message) {
		this.status_message = status_message;
	}
	public String getBilling_name() {
		return billing_name;
	}
	public void setBilling_name(String billing_name) {
		this.billing_name = billing_name;
	}
	public String getBilling_address() {
		return billing_address;
	}
	public void setBilling_address(String billing_address) {
		this.billing_address = billing_address;
	}
	public String getBilling_city() {
		return billing_city;
	}
	public void setBilling_city(String billing_city) {
		this.billing_city = billing_city;
	}
	public String getBilling_state() {
		return billing_state;
	}
	public void setBilling_state(String billing_state) {
		this.billing_state = billing_state;
	}
	public String getBilling_zip() {
		return billing_zip;
	}
	public void setBilling_zip(String billing_zip) {
		this.billing_zip = billing_zip;
	}
	public String getBilling_country() {
		return billing_country;
	}
	public void setBilling_country(String billing_country) {
		this.billing_country = billing_country;
	}
	public String getBilling_tel() {
		return billing_tel;
	}
	public void setBilling_tel(String billing_tel) {
		this.billing_tel = billing_tel;
	}
	public String getBilling_email() {
		return billing_email;
	}
	public void setBilling_email(String billing_email) {
		this.billing_email = billing_email;
	}
	public String getDelivery_name() {
		return delivery_name;
	}
	public void setDelivery_name(String delivery_name) {
		this.delivery_name = delivery_name;
	}
	public String getDelivery_address() {
		return delivery_address;
	}
	public void setDelivery_address(String delivery_address) {
		this.delivery_address = delivery_address;
	}
	public String getDelivery_city() {
		return delivery_city;
	}
	public void setDelivery_city(String delivery_city) {
		this.delivery_city = delivery_city;
	}
	public String getDelivery_state() {
		return delivery_state;
	}
	public void setDelivery_state(String delivery_state) {
		this.delivery_state = delivery_state;
	}
	public String getDelivery_zip() {
		return delivery_zip;
	}
	public void setDelivery_zip(String delivery_zip) {
		this.delivery_zip = delivery_zip;
	}
	public String getDelivery_country() {
		return delivery_country;
	}
	public void setDelivery_country(String delivery_country) {
		this.delivery_country = delivery_country;
	}
	public String getDelivery_tel() {
		return delivery_tel;
	}
	public void setDelivery_tel(String delivery_tel) {
		this.delivery_tel = delivery_tel;
	}
	public String getMerchant_param1() {
		return merchant_param1;
	}
	public void setMerchant_param1(String merchant_param1) {
		this.merchant_param1 = merchant_param1;
	}
	public String getMerchant_param2() {
		return merchant_param2;
	}
	public void setMerchant_param2(String merchant_param2) {
		this.merchant_param2 = merchant_param2;
	}
	public String getMerchant_param3() {
		return merchant_param3;
	}
	public void setMerchant_param3(String merchant_param3) {
		this.merchant_param3 = merchant_param3;
	}
	public String getMerchant_param4() {
		return merchant_param4;
	}
	public void setMerchant_param4(String merchant_param4) {
		this.merchant_param4 = merchant_param4;
	}
	public String getMerchant_param5() {
		return merchant_param5;
	}
	public void setMerchant_param5(String merchant_param5) {
		this.merchant_param5 = merchant_param5;
	}
	public String getVault() {
		return vault;
	}
	public void setVault(String vault) {
		this.vault = vault;
	}
	public String getOffer_type() {
		return offer_type;
	}
	public void setOffer_type(String offer_type) {
		this.offer_type = offer_type;
	}
	public String getOffer_code() {
		return offer_code;
	}
	public void setOffer_code(String offer_code) {
		this.offer_code = offer_code;
	}
	public Double getDiscount_value() {
		return discount_value;
	}
	public void setDiscount_value(Double discount_value) {
		this.discount_value = discount_value;
	}
	public Double getMer_amount() {
		return mer_amount;
	}
	public void setMer_amount(Double mer_amount) {
		this.mer_amount = mer_amount;
	}
	public String getEci_value() {
		return eci_value;
	}
	public void setEci_value(String eci_value) {
		this.eci_value = eci_value;
	}
	public String getRetry() {
		return retry;
	}
	public void setRetry(String retry) {
		this.retry = retry;
	}
	public String getResponse_code() {
		return response_code;
	}
	public void setResponse_code(String response_code) {
		this.response_code = response_code;
	}
	public String getTrans_date() {
		return trans_date;
	}
	public void setTrans_date(String trans_date) {
		this.trans_date = trans_date;
	}
	public String getBilling_notes() {
		return billing_notes;
	}
	public void setBilling_notes(String billing_notes) {
		this.billing_notes = billing_notes;
	}
	public String getBin_country() {
		return bin_country;
	}
	public void setBin_country(String bin_country) {
		this.bin_country = bin_country;
	}
	@Override
	public String toString() {
		return "Payments [id=" + id + ", userId=" + userId + ", bookingId=" + bookingId + ", siteId=" + siteId
				+ ", amount=" + amount + ", discount=" + discount + ", currency=" + currency + ", paymentStatus="
				+ paymentStatus + ", order_id=" + order_id + ", phoneNo=" + phoneNo + ", shipping_address="
				+ shipping_address + ", createDate=" + createDate + ", tracking_id=" + tracking_id + ", bank_ref_no="
				+ bank_ref_no + ", order_status=" + order_status + ", failure_message=" + failure_message
				+ ", payment_mode=" + payment_mode + ", card_name=" + card_name + ", status_code=" + status_code
				+ ", status_message=" + status_message + ", billing_name=" + billing_name + ", billing_address="
				+ billing_address + ", billing_city=" + billing_city + ", billing_state=" + billing_state
				+ ", billing_zip=" + billing_zip + ", billing_country=" + billing_country + ", billing_tel="
				+ billing_tel + ", billing_email=" + billing_email + ", delivery_name=" + delivery_name
				+ ", delivery_address=" + delivery_address + ", delivery_city=" + delivery_city + ", delivery_state="
				+ delivery_state + ", delivery_zip=" + delivery_zip + ", delivery_country=" + delivery_country
				+ ", delivery_tel=" + delivery_tel + ", merchant_param1=" + merchant_param1 + ", merchant_param2="
				+ merchant_param2 + ", merchant_param3=" + merchant_param3 + ", merchant_param4=" + merchant_param4
				+ ", merchant_param5=" + merchant_param5 + ", vault=" + vault + ", offer_type=" + offer_type
				+ ", offer_code=" + offer_code + ", discount_value=" + discount_value + ", mer_amount=" + mer_amount
				+ ", eci_value=" + eci_value + ", retry=" + retry + ", response_code=" + response_code + ", trans_date="
				+ trans_date + ", billing_notes=" + billing_notes + ", bin_country=" + bin_country + "]";
	}

	
}
