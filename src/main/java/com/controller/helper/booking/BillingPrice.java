package com.controller.helper.booking;

public class BillingPrice {
	Amount amount;
	Amount netAmount;

	public Amount getAmount() {
		return amount;
	}

	public void setAmount(Amount amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "BillingPrice [amount=" + amount + ", netAmount=" + netAmount + "]";
	}

	public Amount getNetAmount() {
		return netAmount;
	}

	public void setNetAmount(Amount netAmount) {
		this.netAmount = netAmount;
	}

	
	
}
