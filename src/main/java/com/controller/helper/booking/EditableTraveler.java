package com.controller.helper.booking;

public class EditableTraveler {
	String travelerId;
	String editableInformation;
	public String getTravelerId() {
		return travelerId;
	}
	public void setTravelerId(String travelerId) {
		this.travelerId = travelerId;
	}
	public String getEditableInformation() {
		return editableInformation;
	}
	public void setEditableInformation(String editableInformation) {
		this.editableInformation = editableInformation;
	}
	@Override
	public String toString() {
		return "EditableTraveler [travelerId=" + travelerId + ", editableInformation=" + editableInformation + "]";
	}
	
}
