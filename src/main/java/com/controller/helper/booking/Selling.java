package com.controller.helper.booking;

public class Selling {
	SellingPrice sellingPrice;
	PartnerCommission partnerCommission;
	

	public SellingPrice getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(SellingPrice sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public PartnerCommission getPartnerCommission() {
		return partnerCommission;
	}

	public void setPartnerCommission(PartnerCommission partnerCommission) {
		this.partnerCommission = partnerCommission;
	}

	@Override
	public String toString() {
		return "Selling [sellingPrice=" + sellingPrice + ", partnerCommission=" + partnerCommission + "]";
	}


	
}
