package com.controller.helper.booking;

import java.util.List;

public class BookingPrices {
	List<Billing> billings;
	Selling selling;
	Fees fees;
	TotalPrice total;

	@Override
	public String toString() {
		return "BookingPrices [billings=" + billings + ", selling=" + selling + "]";
	}

	public List<Billing> getBillings() {
		return billings;
	}

	public void setBillings(List<Billing> billings) {
		this.billings = billings;
	}

	public Selling getSelling() {
		return selling;
	}

	public void setSelling(Selling selling) {
		this.selling = selling;
	}

	public Fees getFees() {
		return fees;
	}

	public void setFees(Fees fees) {
		this.fees = fees;
	}

	public TotalPrice getTotal() {
		return total;
	}

	public void setTotal(TotalPrice total) {
		this.total = total;
	}

}
