package com.controller.helper.booking;

public class PassProductAssignmentCancellationEligibility {
	Boolean	eligible;
	
	Boolean partiallyEligible;

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

	@Override
	public String toString() {
		return "PassProductAssignmentCancellationEligibility [eligible=" + eligible + ", partiallyEligible="
				+ partiallyEligible + "]";
	}
	
	
}
