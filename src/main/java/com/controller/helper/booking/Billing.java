package com.controller.helper.booking;

public class Billing {
	BillingPrice billingPrice;
	PartnerCommission partnerCommission;
	BuyerDetails buyerDetails;
	String meansOfPayment;
	Address address;
	@Override
	public String toString() {
		return "Billing [billingPrice=" + billingPrice + ", partnerCommission=" + partnerCommission + "]";
	}

	public BillingPrice getBillingPrice() {
		return billingPrice;
	}

	public void setBillingPrice(BillingPrice billingPrice) {
		this.billingPrice = billingPrice;
	}

	public PartnerCommission getPartnerCommission() {
		return partnerCommission;
	}

	public void setPartnerCommission(PartnerCommission partnerCommission) {
		this.partnerCommission = partnerCommission;
	}

	public String getMeansOfPayment() {
		return meansOfPayment;
	}

	public void setMeansOfPayment(String meansOfPayment) {
		this.meansOfPayment = meansOfPayment;
	}

	public BuyerDetails getBuyerDetails() {
		return buyerDetails;
	}

	public void setBuyerDetails(BuyerDetails buyerDetails) {
		this.buyerDetails = buyerDetails;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
