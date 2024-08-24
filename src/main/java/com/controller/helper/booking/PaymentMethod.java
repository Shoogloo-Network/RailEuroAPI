package com.controller.helper.booking;

public class PaymentMethod {
String type;

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

@Override
public String toString() {
	return "PaymentMethod [type=" + type + "]";
}

}
