package com.controller.helper.booking;

public class AmountsToDisplay {
	Amount amount;
	PartnerCommission partnerCommission;
	public Amount getAmount() {
		return amount;
	}
	public void setAmount(Amount amount) {
		this.amount = amount;
	}
	public PartnerCommission getPartnerCommission() {
		return partnerCommission;
	}
	public void setPartnerCommission(PartnerCommission partnerCommission) {
		this.partnerCommission = partnerCommission;
	}
	@Override
	public String toString() {
		return "AmountsToDisplay [amount=" + amount + ", partnerCommission=" + partnerCommission + "]";
	}

}
