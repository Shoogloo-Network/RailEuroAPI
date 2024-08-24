package com.controller.helper.booking;

import java.util.List;

public class ExchangeOfferSearchInput {
List<PointToPointItemOfferExchangeSearchInput>items;
List<String>productFilters;
public List<PointToPointItemOfferExchangeSearchInput> getItems() {
	return items;
}
public void setItems(List<PointToPointItemOfferExchangeSearchInput> items) {
	this.items = items;
}
public List<String> getProductFilters() {
	return productFilters;
}
public void setProductFilters(List<String> productFilters) {
	this.productFilters = productFilters;
}
@Override
public String toString() {
	return "ExchangeOfferSearchInput [productFilters=" + productFilters + ", getProductFilters()=" + getProductFilters()+ "]";
}


}
