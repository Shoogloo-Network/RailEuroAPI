package com.controller.helper.booking;

import java.util.List;

public class TotalPrice {

List<Amount>billingsGross;

public List<Amount> getBillingsGross() {
	return billingsGross;
}

public void setBillingsGross(List<Amount> billingsGross) {
	this.billingsGross = billingsGross;
}

@Override
public String toString() {
	return "TotalPrice [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
			+ "]";
}

}
