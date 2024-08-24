package com.controller.helper.booking;

import java.util.List;

public class Fees {
List<FeeItem>items;

public List<FeeItem> getItems() {
	return items;
}

public void setItems(List<FeeItem> items) {
	this.items = items;
}

@Override
public String toString() {
	return "Fees [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}

}
