package com.controller.helper.booking;

public class FeeItem {
	String label;
	Prices price;
	FeeProduct product;
	String paymentId;
	@Override
	public String toString() {
		return "FeeItem [label=" + label + ", price=" + price + ", paymentId=" + paymentId + "]";
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public Prices getPrice() {
		return price;
	}
	public void setPrice(Prices price) {
		this.price = price;
	}
	public FeeProduct getProduct() {
		return product;
	}
	public void setProduct(FeeProduct product) {
		this.product = product;
	}
	public String getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	
	
}
