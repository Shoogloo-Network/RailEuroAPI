package com.controller.helper.pointoffer;

import java.util.List;

import com.controller.helper.Flexibility;
import com.controller.helper.ResourceError;
import com.controller.helper.booking.Prices;
import com.controller.helper.booking.TicketingOption;

public class PointToPointOffer {
List<FareOffer>  fareOffers;
List<ServiceOffer> serviceOffers;
String legSolution;
List<String>compatibleOffers;

Comfort comfortCategory;
Flexibility flexibility;
List<LegSolutionHighlight> compatibleHighlights;
Boolean globalRoundTripPrice;
List<TicketingOption> ticketingOptions;
List<ResourceError> errors;
Prices prices;
String category;
String expirationDate;
String location;
String type;
@Override
public String toString() {
	return "PointToPointOffer [legSolution=" + legSolution + ", compatibleOffers=" + compatibleOffers
			+ ", globalRoundTripPrice=" + globalRoundTripPrice + ", category=" + category + ", expirationDate="
			+ expirationDate + ", location=" + location + ", type=" + type + "]";
}
public List<FareOffer> getFareOffers() {
	return fareOffers;
}
public void setFareOffers(List<FareOffer> fareOffers) {
	this.fareOffers = fareOffers;
}
public List<ServiceOffer> getServiceOffers() {
	return serviceOffers;
}
public void setServiceOffers(List<ServiceOffer> serviceOffers) {
	this.serviceOffers = serviceOffers;
}
public String getLegSolution() {
	return legSolution;
}
public void setLegSolution(String legSolution) {
	this.legSolution = legSolution;
}
public List<String> getCompatibleOffers() {
	return compatibleOffers;
}
public void setCompatibleOffers(List<String> compatibleOffers) {
	this.compatibleOffers = compatibleOffers;
}
public Comfort getComfortCategory() {
	return comfortCategory;
}
public void setComfortCategory(Comfort comfortCategory) {
	this.comfortCategory = comfortCategory;
}
public Flexibility getFlexibility() {
	return flexibility;
}
public void setFlexibility(Flexibility flexibility) {
	this.flexibility = flexibility;
}
public List<LegSolutionHighlight> getCompatibleHighlights() {
	return compatibleHighlights;
}
public void setCompatibleHighlights(List<LegSolutionHighlight> compatibleHighlights) {
	this.compatibleHighlights = compatibleHighlights;
}
public Boolean getGlobalRoundTripPrice() {
	return globalRoundTripPrice;
}
public void setGlobalRoundTripPrice(Boolean globalRoundTripPrice) {
	this.globalRoundTripPrice = globalRoundTripPrice;
}
public List<TicketingOption> getTicketingOptions() {
	return ticketingOptions;
}
public void setTicketingOptions(List<TicketingOption> ticketingOptions) {
	this.ticketingOptions = ticketingOptions;
}
public List<ResourceError> getErrors() {
	return errors;
}
public void setErrors(List<ResourceError> errors) {
	this.errors = errors;
}
public Prices getPrices() {
	return prices;
}
public void setPrices(Prices prices) {
	this.prices = prices;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public String getExpirationDate() {
	return expirationDate;
}
public void setExpirationDate(String expirationDate) {
	this.expirationDate = expirationDate;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}


}
