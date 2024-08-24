package com.controller.helper.booking;

public class Amount {
	Number value;

	String currency;

	public Number getValue() {
		return value;
	}

	public void setValue(Number value) {
		this.value = value;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Override
	public String toString() {
		return "Amount [value=" + value + ", currency=" + currency + "]";
	}

}
