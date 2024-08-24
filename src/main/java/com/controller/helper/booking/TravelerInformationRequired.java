package com.controller.helper.booking;
import java.util.List;

public class TravelerInformationRequired {
List<String> defaultTravelerInformationRequired;
List<String>  leadTravelerInformationRequired;
@Override
public String toString() {
	return "TravelerInformationRequired [defaultTravelerInformationRequired=" + defaultTravelerInformationRequired
			+ ", leadTravelerInformationRequired=" + leadTravelerInformationRequired + "]";
}
public List<String> getDefaultTravelerInformationRequired() {
	return defaultTravelerInformationRequired;
}
public void setDefaultTravelerInformationRequired(List<String> defaultTravelerInformationRequired) {
	this.defaultTravelerInformationRequired = defaultTravelerInformationRequired;
}
public List<String> getLeadTravelerInformationRequired() {
	return leadTravelerInformationRequired;
}
public void setLeadTravelerInformationRequired(List<String> leadTravelerInformationRequired) {
	this.leadTravelerInformationRequired = leadTravelerInformationRequired;
}}