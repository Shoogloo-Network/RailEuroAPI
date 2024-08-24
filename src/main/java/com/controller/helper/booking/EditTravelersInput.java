package com.controller.helper.booking;

import java.util.List;

public class EditTravelersInput {

List<EditedTraveler>editedTravelers;

public List<EditedTraveler> getEditedTravelers() {
	return editedTravelers;
}

public void setEditedTravelers(List<EditedTraveler> editedTravelers) {
	this.editedTravelers = editedTravelers;
}

@Override
public String toString() {
	return "EditTravelersInput [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
}

}
