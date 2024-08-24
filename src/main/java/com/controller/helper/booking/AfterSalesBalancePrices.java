package com.controller.helper.booking;

import java.util.List;

public class AfterSalesBalancePrices {
	List<Billing> billings;
	Selling selling;
	List<AmountsToDisplay> amountsToDisplay;
	Fees fees;
	Prices reversedPrices;
	TotalPrice total;
	TotalPrice reversedTotal;
	TotalPrice newItemTotal;

	Prices newItemPrices;

	
	
	

	@Override
	public String toString() {
		return "AfterSalesBalancePrices [billings=" + billings + ", selling=" + selling + ", fees=" + fees + "]";
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

	public Prices getReversedPrices() {
		return reversedPrices;
	}

	public void setReversedPrices(Prices reversedPrices) {
		this.reversedPrices = reversedPrices;
	}

	public TotalPrice getTotal() {
		return total;
	}

	public void setTotal(TotalPrice total) {
		this.total = total;
	}

	public TotalPrice getReversedTotal() {
		return reversedTotal;
	}

	public void setReversedTotal(TotalPrice reversedTotal) {
		this.reversedTotal = reversedTotal;
	}

	public TotalPrice getNewItemTotal() {
		return newItemTotal;
	}

	public void setNewItemTotal(TotalPrice newItemTotal) {
		this.newItemTotal = newItemTotal;
	}

	

	public List<AmountsToDisplay> getAmountsToDisplay() {
		return amountsToDisplay;
	}

	public void setAmountsToDisplay(List<AmountsToDisplay> amountsToDisplay) {
		this.amountsToDisplay = amountsToDisplay;
	}

	public Prices getNewItemPrices() {
		return newItemPrices;
	}

	public void setNewItemPrices(Prices newItemPrices) {
		this.newItemPrices = newItemPrices;
	}

}
