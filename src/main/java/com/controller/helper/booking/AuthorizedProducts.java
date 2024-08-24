package com.controller.helper.booking;

import java.util.List;

public class AuthorizedProducts {
List<String>suppliers;
List<String>marketingCarriers;
public List<String> getSuppliers() {
	return suppliers;
}
public void setSuppliers(List<String> suppliers) {
	this.suppliers = suppliers;
}
public List<String> getMarketingCarriers() {
	return marketingCarriers;
}
public void setMarketingCarriers(List<String> marketingCarriers) {
	this.marketingCarriers = marketingCarriers;
}
@Override
public String toString() {
	return "AuthorizedProducts [suppliers=" + suppliers + ", marketingCarriers=" + marketingCarriers + "]";
}

}
