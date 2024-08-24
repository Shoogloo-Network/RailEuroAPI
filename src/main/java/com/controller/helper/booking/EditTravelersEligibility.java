package com.controller.helper.booking;

import java.util.List;

public class EditTravelersEligibility {
	Boolean eligible;
	
	List<EditableTraveler>editableTravelers;

	@Override
	public String toString() {
		return "EditTravelersEligibility [eligible=" + eligible + ", editableTravelers=" + editableTravelers + "]";
	}

	public Boolean getEligible() {
		return eligible;
	}

	public void setEligible(Boolean eligible) {
		this.eligible = eligible;
	}

	public List<EditableTraveler> getEditableTravelers() {
		return editableTravelers;
	}

	public void setEditableTravelers(List<EditableTraveler> editableTravelers) {
		this.editableTravelers = editableTravelers;
	}
	
}
