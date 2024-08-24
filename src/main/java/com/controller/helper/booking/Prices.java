package com.controller.helper.booking;

import java.util.List;

public class Prices {
	List<Billing> billings;
	Selling selling;

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

	@Override
	public String toString() {
		return "Prices [billings=" + billings + ", selling=" + selling + "]";
	}

}
