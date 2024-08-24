package com.controller.helper.booking;

import java.util.List;

public class BookingItemCancellationEligibility {
	Boolean eligible;
	Boolean partiallyEligible;
	List<?> cancellableItems;

	@Override
	public String toString() {
		return "BookingItemCancellationEligibility [eligible=" + eligible + ", partiallyEligible=" + partiallyEligible
				+ ", cancellableItems=" + cancellableItems + "]";
	}

	public Boolean getEligible() {
		return eligible;
	}

	public void setEligible(Boolean eligible) {
		this.eligible = eligible;
	}

	public Boolean getPartiallyEligible() {
		return partiallyEligible;
	}

	public void setPartiallyEligible(Boolean partiallyEligible) {
		this.partiallyEligible = partiallyEligible;
	}

	public List<?> getCancellableItems() {
		return cancellableItems;
	}

	public void setCancellableItems(List<?> cancellableItems) {
		this.cancellableItems = cancellableItems;
	}

}
