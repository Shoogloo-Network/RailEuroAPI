package com.controller.helper.booking;

public class PassPeriod {
String	startDate;
String	endDate;
public String getStartDate() {
	return startDate;
}
public void setStartDate(String startDate) {
	this.startDate = startDate;
}
public String getEndDate() {
	return endDate;
}
public void setEndDate(String endDate) {
	this.endDate = endDate;
}
@Override
public String toString() {
	return "PassPeriod [startDate=" + startDate + ", endDate=" + endDate + "]";
}

}
