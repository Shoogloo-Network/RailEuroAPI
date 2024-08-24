package com.controller.helper.booking;
import java.util.List;

public class OffersHighlight {
String comfort;
List<String> offers;
public String getComfort() {
	return comfort;
}
public void setComfort(String comfort) {
	this.comfort = comfort;
}
public List<String> getOffers() {
	return offers;
}
public void setOffers(List<String> offers) {
	this.offers = offers;
}
@Override
public String toString() {
	return "OffersHighlight [comfort=" + comfort + ", offers=" + offers + "]";
}

}